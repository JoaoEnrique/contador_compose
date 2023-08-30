package com.example.aulasabado.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen() {
    Column{
        Text(text = "adsdf")
        Text ("TextDaMainScreen")


            Button(onClick = {
                Log.i(" ### MainScreen(){...", "Botão1 Clicado!!")
            }) {
                Text("Btn1")
            }

            Button(onClick = { }){
                Text("Navegar para TaskScreen")
            }
        }
}

