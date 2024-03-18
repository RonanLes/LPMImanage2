package com.example.lpmi_manage.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "job_offer")
data class JobOfferModel(
    @PrimaryKey val uid: Int,
    val title: String,
    val location: String,
    val description: String
)

val jobOffers = listOf(
    JobOfferModel(1,"Développeur Android", "Paris", "Description de l'offre 1"),
    JobOfferModel(2, "Ingénieur Backend", "Lyon", "Description de l'offre 2"),
    JobOfferModel(3, "UI/UX Designer", "Marseille", "Description de l'offre 3"),
    JobOfferModel(4, "Développeur Full Stack", "Lille", "Description de l'offre 4"),
    JobOfferModel(5, "Data Analyst", "Bordeaux", "Description de l'offre 5"),
    JobOfferModel(6, "Développeur iOS", "Rennes", "Description de l'offre 6"),
    JobOfferModel(7, "Développeur Frontend", "Nantes", "Description de l'offre 7"),
    JobOfferModel(8, "Ingénieur DevOps", "Strasbourg", "Description de l'offre 8"),
    JobOfferModel(9, "Développeur Java", "Nice", "Description de l'offre 9"),
    JobOfferModel(10, "Développeur Python", "Toulouse", "Description de l'offre 10"),
    JobOfferModel(11, "Développeur C#", "Montpellier", "Description de l'offre 11"),
    JobOfferModel(12, "Développeur Ruby", "Nancy", "Description de l'offre 12"),
    JobOfferModel(13, "Développeur PHP", "Dijon", "Description de l'offre 13"),
    JobOfferModel(14, "Développeur Go", "Lyon", "Description de l'offre 14"),
    JobOfferModel(15, "Développeur Swift", "Paris", "Description de l'offre 15"),
    JobOfferModel(16, "Développeur Kotlin", "Marseille", "Description de l'offre 16"),
    JobOfferModel(17, "Développeur Rust", "Lille", "Description de l'offre 17"),
    JobOfferModel(18, "Développeur Scala", "Bordeaux", "Description de l'offre 18"),
    JobOfferModel(19, "Développeur TypeScript", "Rennes", "Description de l'offre 19"),
    JobOfferModel(20, "Développeur JavaScript", "Nantes", "Description de l'offre 20"),
)

