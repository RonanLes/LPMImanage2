package com.example.lpmi_manage.component

import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
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
    JobOfferModel("UI/UX Designer", "Marseille", "Description de l'offre 3"),
    JobOfferModel("Développeur Full Stack", "Lille", "Description de l'offre 4"),
    JobOfferModel("Data Analyst", "Bordeaux", "Description de l'offre 5"),
    JobOfferModel("Développeur iOS", "Rennes", "Description de l'offre 6"),
    JobOfferModel("Développeur Frontend", "Nantes", "Description de l'offre 7"),
    JobOfferModel("Ingénieur DevOps", "Strasbourg", "Description de l'offre 8"),
    JobOfferModel("Développeur Java", "Nice", "Description de l'offre 9"),
    JobOfferModel("Développeur Python", "Toulouse", "Description de l'offre 10"),
    JobOfferModel("Développeur C#", "Montpellier", "Description de l'offre 11"),
    JobOfferModel("Développeur Ruby", "Nancy", "Description de l'offre 12"),
    JobOfferModel("Développeur PHP", "Dijon", "Description de l'offre 13")
)

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
            JobOfferCard(jobOffer = jobOffers[index], navController = navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobOfferCard(jobOffer: JobOfferModel, navController: NavController?) {
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
