package com.example.lpmi_manage

import android.content.Context
import androidx.room.*
import com.example.lpmi_manage.models.JobOfferDAO
import com.example.lpmi_manage.models.JobOfferModel

@Database(entities = [JobOfferModel::class], version = 1)
abstract class AppDatabase: RoomDatabase()
{
    abstract fun jobOfferDAO(): JobOfferDAO
    companion object{
        @Volatile private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return instance ?: synchronized(this){
                val newInstance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "job_offer_database").build()
                instance = newInstance
                newInstance
            }
        }
    }
}