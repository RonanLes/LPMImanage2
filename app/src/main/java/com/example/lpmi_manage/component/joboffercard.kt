package com.example.lpmi_manage.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lpmi_manage.models.JobOfferModel

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