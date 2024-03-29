package com.example.lpmi_manage.utils

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lpmi_manage.views.Home
import com.example.lpmi_manage.views.Login
import com.example.lpmi_manage.views.OfferList
import com.example.lpmi_manage.views.Registration

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { Home(navController) }
        composable("login") { Login(navController) }
        composable("registration") { Registration(navController) }
        composable("offerlist/{username}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username")
            if (username != null) {
                OfferList(username, navController)
            }
        }
    }
    }