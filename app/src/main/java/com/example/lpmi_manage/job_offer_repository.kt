package com.example.lpmi_manage

import com.example.lpmi_manage.models.JobOfferDAO
import com.example.lpmi_manage.models.JobOfferModel

interface JobOfferRepository {
    suspend fun getJobOfferById(id: Int): JobOfferModel
    suspend fun insertJobOffer(jobOffer: JobOfferModel)
}

class JobOfferRepositoryImpl(private val jobOfferDAO: JobOfferDAO) : JobOfferRepository {
    override suspend fun getJobOfferById(id: Int): JobOfferModel {
        return jobOfferDAO.getJob(id)
    }

    override suspend fun insertJobOffer(jobOffer: JobOfferModel) {
        jobOfferDAO.insert(jobOffer)
    }
}