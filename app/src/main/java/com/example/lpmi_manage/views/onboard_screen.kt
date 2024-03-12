package com.example.lpmi_manage.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.lpmi_manage.R

@Composable
    fun Home(navController: NavController){
        Column {
            Text("Welcome to the Home Screen")
            Image(
                painter = painterResource(id = R.mipmap.ublogo_foreground),
                contentDescription = "LPMI Logo"
            )
            Button(onClick = { navController.navigate("login") }) {
                Text("continue")
            }
        }
    }
