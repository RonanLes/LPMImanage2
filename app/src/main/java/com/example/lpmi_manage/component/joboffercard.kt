import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.lpmi_manage.models.JobOfferModel
import com.example.lpmi_manage.views.JobOfferViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobOfferCardView(jobOffer: JobOfferModel, navController: NavController?, context: Context) {
    val viewModel: JobOfferViewModel = viewModel()

    // You can customize the appearance of each job offer card here
    Card(modifier = Modifier
        .padding(8.dp)
        .size(300.dp, 100.dp),
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .size(300.dp, 100.dp),
        ) {
            Text(text = "${jobOffer.title} - ${jobOffer.location}")

            Button(
                onClick = {
                    viewModel.saveJobOffer(jobOffer)
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Enregistrer")
            }
        }
    }
}
