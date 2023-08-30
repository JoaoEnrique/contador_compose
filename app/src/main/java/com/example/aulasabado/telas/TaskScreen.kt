package com.example.aulasabado.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){
    //var vlrTextField  = "VlrInicial"

    //recompose
    /* vlrTextField = remember {
        mutableStateOf("VlrIncial")
    }*/

    var contador = remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.padding(20.dp)){
        /*Text(text = "Título da Tarefa")
        TextField(
            value = vlrTextField.value,
            onValueChange = {

                vlrTextField.value = it
                Log.i(" ### fun TaskScreen(){...", it)
            })
        Spacer(modifier = Modifier.width(20 \a.dp))
        Text(vlrTextField.value)*/
        
        Button(onClick = {
            contador.value = contador.value + 1
        }) {
            Text(text = "Incrementa Contador")
        }

        Text(contador.value.toString())
    }
}