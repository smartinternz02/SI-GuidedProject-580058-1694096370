package com.example.food4u

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food4u.ui.theme.Food4UTheme
import javax.sql.DataSource

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Food4UTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var usernameInput by remember {
                        mutableStateOf("")
                    }
                    var pwdInput by remember {
                        mutableStateOf("")
                    }


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .paint(
                                painterResource(id = R.drawable.foodwallpaper),
                                contentScale = ContentScale.FillBounds,
                            )
                    ) {


                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(0.3f)
                                .padding(8.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Text(
                                text = "Food4U",
                                fontSize = 50.sp,
                                color = Color(0xfff4ce14),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(20.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(0.7f)
                                .padding(8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                TextField(
                                    value = usernameInput,
                                    onValueChange = { usernameInput = it},
                                    label = { Text(text = "Username") },
                                    placeholder = { Text(text = "Enter Username") },
                                    keyboardOptions = KeyboardOptions.Default.copy(
                                        imeAction = ImeAction.Next
                                    )
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                TextField(
                                    value = pwdInput, onValueChange = { pwdInput = it },
                                    label = { Text("Password") },
                                    keyboardOptions = KeyboardOptions.Default.copy(
                                        keyboardType = KeyboardType.Password,
                                        imeAction = ImeAction.Done
                                    ),
                                    visualTransformation = PasswordVisualTransformation()
                                )

                                Spacer(modifier = Modifier.height(20.dp))



                                Button(
                                    onClick =
                                    {
                                        val navigate = Intent(this@MainActivity, Hotels::class.java)
                                        startActivity(navigate)
                                    },
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier.padding(horizontal = 20.dp),
                                    colors = ButtonDefaults.buttonColors(Color.Black)
                                ) {
                                    Text("Login")
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}