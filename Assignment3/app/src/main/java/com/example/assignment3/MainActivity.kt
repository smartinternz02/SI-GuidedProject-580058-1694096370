package com.example.assignment3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment3.ui.theme.Assignment3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
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
            .background(Color(0xFF257f8f))
            .padding(20.dp)
    ) {

        Text(
            text = "Login Screen",
            fontSize = 32.sp,
            color = Color(0xfff4ce14),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp),

        )

        TextField(
            value = usernameInput,
            onValueChange = {newText ->
                usernameInput = newText
            },
            label = { Text(text = "Username") },
            placeholder = { Text(text = "Type your name") }
        )
        TextField(
            value = pwdInput, onValueChange = {pwdInput = it},
            label = { Text("Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))


        val radioOptions = listOf("Amazon", "Flipkart", "Myntra")

        var selectedItem by remember {
            mutableStateOf(radioOptions[0])
        }

        Column(modifier = Modifier.selectableGroup()) {
            radioOptions.forEach { label ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .selectable(
                            selected = (selectedItem == label),
                            onClick = { selectedItem = label },
                            role = androidx.compose.ui.semantics.Role.RadioButton
                        )
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.padding(end = 16.dp),
                        imageVector = if (selectedItem == label)
                            Icons.Filled.CheckCircle else
                            Icons.Filled.AddCircle,

                        contentDescription = null,
                        tint = Color.White
                    )
                    Text(text = label)
                }
            }
        }



        val context = LocalContext.current
        val amazon = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/")) }
        val flipkart = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/")) }
        val myntra = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/")) }
        val google = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/")) }

        Button(
            onClick = {
                when (selectedItem) {
                    "Amazon" -> context.startActivity(amazon)
                    "Flipkart" -> context.startActivity(flipkart)
                    "Myntra" -> context.startActivity(myntra)
                    else -> context.startActivity(google)
                }
            },
            shape = RoundedCornerShape(10.dp),
            modifier=Modifier.padding(horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text("Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginScreen()
}