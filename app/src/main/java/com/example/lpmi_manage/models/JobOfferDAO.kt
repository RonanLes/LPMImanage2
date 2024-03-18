package com.example.lpmi_manage.models

import androidx.room.*


@Dao
interface JobOfferDAO{
    @Query("SELECT * FROM job_offer")
    fun getAll(): List<JobOfferModel>
    @Query("SELECT * FROM job_offer WHERE title LIKE :title")
    fun findByTitle(title: String): JobOfferModel

    @Insert
    fun insertAll(vararg jobOffers: JobOfferModel)
    @Delete
    fun delete(jobOffer: JobOfferModel)

}