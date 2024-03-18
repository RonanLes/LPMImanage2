package com.example.lpmi_manage.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface JobOfferDAO {
    @Query("SELECT * FROM job_offer")
    fun getAll():List<JobOfferModel>

    @Query("SELECT * FROM job_offer WHERE title=:titre")
    fun getJob(titre: Int):JobOfferModel

    @Update
    suspend fun update(jobOfferModel: JobOfferModel)

    @Insert
    suspend fun insert(jobOfferModel: JobOfferModel)

    @Delete
    suspend fun deleteJob(jobOfferModel: JobOfferModel)
}