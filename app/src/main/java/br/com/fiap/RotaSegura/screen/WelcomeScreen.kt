package br.com.fiap.RotaSegura.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.RotaSegura.components.BackgroundImageBox
import br.com.fiap.RotaSegura.components.CustomButton
import br.com.fiap.RotaSegura.components.CustomSpacer
import br.com.fiap.RotaSegura.components.CustomText
import br.com.fiap.mobilidadecomseguranca.R

@Composable
fun WelcomeScreen() {
    Box {
        BackgroundImageBox()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            CustomSpacer(
                modificador = Modifier.height(20.dp)
            )

            CustomText(
                texto = stringResource(id = R.string.rota_segura),
                tamanhodaLetra = 36.sp,
                pesodaFonte = FontWeight.ExtraBold,
                cor = Color.Blue,
                alinhamentoTexto = TextAlign.Center
                )
            CustomSpacer(
                modificador = Modifier.height(25.dp)
            )

            CustomText(
                texto = stringResource(id = R.string.boas_vindas),
                tamanhodaLetra = 24.sp,
                pesodaFonte = FontWeight.ExtraBold,
                cor = Color(0xFF3A092F),
                alinhamentoTexto = TextAlign.Center
            )

            CustomSpacer(
                modificador = Modifier.height(15.dp)
            )

            CustomText(
                texto = stringResource(id = R.string.encontre),
                tamanhodaLetra = 20.sp,
                pesodaFonte = FontWeight.Bold,
                cor = Color(0xFF0E0D0E),
                alinhamentoTexto = TextAlign.Center,
                modificador = Modifier.padding(8.dp)
            )

            CustomSpacer(
                modificador = Modifier.height(15.dp)
            )

            CustomButton(
                text = "Cadastrar-se",
                onclick = {/* TODO: Adicionar ação */}
            )

            CustomSpacer(
                modificador = Modifier.height(30.dp)
            )

            CustomButton(
                text = "Entrar com o Google",
                onclick = {/* TODO: Adicionar ação */}
            )

            CustomSpacer(
                modificador = Modifier.height(30.dp)
            )

            CustomButton(
                text = "Entrar com Facebook",
                onclick = {/* TODO: Adicionar ação */}
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
