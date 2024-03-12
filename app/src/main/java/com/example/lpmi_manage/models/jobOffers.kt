package com.example.lpmi_manage.models

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
    JobOfferModel("Développeur PHP", "Dijon", "Description de l'offre 13"),
    JobOfferModel("Développeur Go", "Lyon", "Description de l'offre 14"),
    JobOfferModel("Développeur Swift", "Paris", "Description de l'offre 15"),
    JobOfferModel("Développeur Kotlin", "Marseille", "Description de l'offre 16"),
    JobOfferModel("Développeur Rust", "Lille", "Description de l'offre 17"),
    JobOfferModel("Développeur Scala", "Bordeaux", "Description de l'offre 18"),
    JobOfferModel("Développeur TypeScript", "Rennes", "Description de l'offre 19"),
    JobOfferModel("Développeur JavaScript", "Nantes", "Description de l'offre 20")
)