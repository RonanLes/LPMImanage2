package com.example.lpmi_manage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lpmi_manage.component.Home
import com.example.lpmi_manage.component.Login
import com.example.lpmi_manage.component.OfferList
import com.example.lpmi_manage.ui.theme.LPMI_manageTheme
import com.example.lpmi_manage.component.Registration
import com.example.lpmi_manage.utils.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LPMI_manageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
NavGraph()
                }
            }
        }
    }
}


