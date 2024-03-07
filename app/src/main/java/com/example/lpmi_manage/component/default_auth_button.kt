package com.example.lpmi_manage.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


    @Composable
    fun DefaultAuthButton(onFirstButtonClicked:  () ->  Unit, onSecondButtonClicked:() ->Unit, LabelFirstButton:String, LabelSecondButton:String){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Button(
                onClick =  onFirstButtonClicked ,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(LabelFirstButton)
            }
            Button(
                onClick = onSecondButtonClicked ,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            ) {
                Text(LabelSecondButton)
            }
        }
    }
