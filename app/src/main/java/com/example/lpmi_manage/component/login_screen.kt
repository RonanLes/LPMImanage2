package com.example.lpmi_manage.component

import android.widget.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
import androidx.navigation.NavController


    @Composable
    fun Login( navController: NavController){
        val nom = remember { mutableStateOf("") }
        val mail = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        val context = LocalContext.current

        Column(modifier = Modifier.padding(16.dp)) {
            OutlinedTextField(
                value = nom.value,
                onValueChange = { nom.value = it },
                label = { Text("Username") }
            )
            OutlinedTextField(
                value = mail.value,
                onValueChange = { mail.value = it },
                label = { Text("email") }
            )

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text("Password") }
            )

    DefaultAuthButton(
        onFirstButtonClicked = { if (nom.value.isEmpty() || mail.value.isEmpty() || password.value.isEmpty()) {
            // Show a toast message if any field is empty
            Toast.makeText(context, "All fields must be filled", Toast.LENGTH_SHORT).show()
        }  else {
            // Navigate to the home page and pass the input data
            navController.navigate("home") {
                launchSingleTop = true
                restoreState = true
                // Pass the input data to the home page
                var arguments = bundleOf(
                    "username" to nom.value,
                    "email" to mail.value,
                    "password" to password.value
                )
            }
        } },
        onSecondButtonClicked = { navController.navigate("registration") },
        LabelFirstButton = "Home" ,
        LabelSecondButton = "Register"
    )
        }
    }