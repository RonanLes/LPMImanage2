package com.example.lpmi_manage.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lpmi_manage.component.DefaultAuthButton

@Composable
    fun Registration(navController: NavController) {
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        val confirmPassword = remember { mutableStateOf("") }

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

            OutlinedTextField(
                value = confirmPassword.value,
                onValueChange = { confirmPassword.value = it },
                label = { Text("Confirm Password") }
            )

            DefaultAuthButton(
                onFirstButtonClicked = { navController.navigate("login") },
                onSecondButtonClicked = { navController.navigate("home") },
                LabelFirstButton = "Login",
                LabelSecondButton = "Home"
            )
        }
    }
