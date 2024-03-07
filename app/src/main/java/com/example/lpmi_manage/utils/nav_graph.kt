package com.example.lpmi_manage.utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lpmi_manage.component.Home
import com.example.lpmi_manage.component.Login
import com.example.lpmi_manage.component.OfferList
import com.example.lpmi_manage.component.Registration

@Composable
fun NavGraph(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { Home(navController) }
        composable("login") { Login(navController) }
        composable("registration") { Registration(navController) }
        composable("offerlist") { OfferList(navController) }
    }
}