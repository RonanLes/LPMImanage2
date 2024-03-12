package com.example.lpmi_manage.view

import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
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
    LazyColumn {
        items(jobOffers.size) { index ->
            JobOfferCardView(jobOffer = jobOffers[index], navController = navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobOfferCardView(jobOffer: JobOfferModel, navController: NavController?) {
    // You can customize the appearance of each job offer card here
    Card(modifier = Modifier
        .padding(8.dp)
        .size(300.dp, 100.dp),
    )
    {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .size(300.dp, 100.dp),

            ) {
            Text(text = "${jobOffer.title} - ${jobOffer.location}")

        }
    }
}


