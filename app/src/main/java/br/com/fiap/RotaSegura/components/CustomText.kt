package br.com.fiap.RotaSegura.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(
    texto: String,
    modificador: Modifier = Modifier,
    tamanhodaLetra: TextUnit = 16.sp,
    pesodaFonte: FontWeight = FontWeight.Normal,
    cor: Color = Color.Black,
    alinhamentoTexto: TextAlign? = null,
    ){
    Text(
        text = texto,
        modifier = modificador,
        fontSize = tamanhodaLetra,
        fontWeight = pesodaFonte,
        color = cor,
        textAlign = alinhamentoTexto
        )
}