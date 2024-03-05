package com.example.lpmi_manage.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class LoginScreen(private val navController: NavController) {

    @Composable
    fun Login(){
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        Column(modifier = Modifier.padding(16.dp)) {
            OutlinedTextField(
                value = username.value,
                onValueChange = { username.value = it },
                label = { Text("Username") }
            )

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text("Password") }
            )

            Button(onClick = { /* Handle login */ }) {
                Text("Login")
            }

            Button(onClick = { /* Handle signup */ }) {
                Text("Signup")
            }
            Button(onClick = { navController.navigate("registration") }) {
                Text("Go to Registration")
            }
        }
    }
}