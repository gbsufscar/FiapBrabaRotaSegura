package br.com.fiap.RotaSegura.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp




@Composable
fun CaixaDeEntrada(
    valordeEntrada: String,
    disoqueDigitar: String,
    tituloCaixa: String,
    formatacao: Modifier,
    tipodeTeclado: KeyboardType,
    atualizarValor: (String) -> Unit      // () qd abro parenteses estou dizeno que é uma função que recebe uma String como argumento e  Unit quer dizer que é uma função que não retorna nada é igual ao Void do Java
) {                                       // -> Isso separa o tipo dos parâmetros do tipo de retorno da função.
    OutlinedTextField(
        value = valordeEntrada,
        onValueChange = atualizarValor,
        modifier = formatacao
            .fillMaxWidth()
            .padding(top = 16.dp),
        placeholder = {
            Text(text = disoqueDigitar)
        },
        label = {
            Text(text = tituloCaixa)
        },
        keyboardOptions = KeyboardOptions(keyboardType = tipodeTeclado)
    )
}



