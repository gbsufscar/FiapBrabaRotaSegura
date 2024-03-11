package br.com.fiap.RotaSegura.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//Componente Custom Button modularizado
@Composable

fun CustomButton(
    text: String ,
    onclick:() -> Unit

){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .width(250.dp)
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White

        )


    ) {
        Text(text = text, fontSize = 18.sp)

    }
}