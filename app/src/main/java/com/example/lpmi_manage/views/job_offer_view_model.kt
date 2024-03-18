package com.example.lpmi_manage.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lpmi_manage.JobOfferRepository
import com.example.lpmi_manage.models.JobOfferModel
import kotlinx.coroutines.launch

class JobOfferViewModel(private val repository: JobOfferRepository) : ViewModel() {

    private val _jobOffer = MutableLiveData<JobOfferModel>()
    val jobOffer: LiveData<JobOfferModel> = _jobOffer

    fun getJobOfferById(id: Int) {
        viewModelScope.launch {
            _jobOffer.value = repository.getJobOfferById(id)
        }
    }

    fun saveJobOffer(jobOffer: JobOfferModel) {
        viewModelScope.launch {
            repository.insertJobOffer(jobOffer)
        }
    }
}