package com.example.lpmi_manage.views

import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lpmi_manage.component.JobOfferCardView
import com.example.lpmi_manage.models.JobOfferModel
import com.example.lpmi_manage.models.jobOffers


@Composable
fun OfferList(nameUser: String, navController: NavController) {
    val arguments: Bundle? = navController.previousBackStackEntry?.arguments
    val username: String? = nameUser ?: arguments?.getString("username")
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Bienvenue $username",
        )
        JobOfferList(jobOffers = jobOffers, navController = navController)
    }
}

@Composable
fun JobOfferList(jobOffers: List<JobOfferModel>, navController: NavController) {
    var searchQuery by remember { mutableStateOf("" ) }

    Column {
        TextField(
            value = searchQuery,
            onValueChange = { newQuery -> searchQuery = newQuery },
            label = { Text("Rechercher") },
            modifier = Modifier.fillMaxWidth()
        )

        val filteredJobOffers =
            jobOffers.filter { it.title.contains(searchQuery, ignoreCase = true) }

        LazyColumn {
            items(filteredJobOffers) { jobOffer ->
                JobOfferCardView(jobOffer = jobOffer, navController = navController)
            }
        }
    }
}



