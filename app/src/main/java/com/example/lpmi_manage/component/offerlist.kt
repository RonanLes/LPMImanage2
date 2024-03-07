package com.example.lpmi_manage.component

import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



// Modèle de données pour une offre d'emploi
data class JobOfferModel(
    val title: String,
    val location: String,
    val description: String
)

// Exemple de liste d'offres d'emploi (à remplacer par vos propres données)
val jobOffers = listOf(
    JobOfferModel("Développeur Android", "Paris", "Description de l'offre 1"),
    JobOfferModel("Ingénieur Backend", "Lyon", "Description de l'offre 2"),
    JobOfferModel("UI/UX Designer", "Marseille", "Description de l'offre 3")
)

@Composable
fun OfferList(nameUser: String, navController: NavController) {
    val arguments: Bundle? = navController.previousBackStackEntry?.arguments
    val username: String? = nameUser ?: arguments?.getString("username")
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Bienvenue $username",
        )
        JobOfferList(jobOffers = jobOffers)
    }
}

@Composable
fun JobOfferList(jobOffers: List<JobOfferModel>) {
    LazyColumn {
        items(jobOffers.size) { index ->
            JobOfferCard(jobOffer = jobOffers[index])
        }
    }
}

@Composable
fun JobOfferCard(jobOffer: JobOfferModel) {
    // You can customize the appearance of each job offer card here
    Text(
        text = "${jobOffer.title} - ${jobOffer.location}",
        modifier = Modifier.padding(8.dp)
    )
}