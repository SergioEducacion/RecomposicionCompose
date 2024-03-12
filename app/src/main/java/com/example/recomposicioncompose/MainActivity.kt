package com.example.recomposicioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recomposicioncompose.ui.theme.RecomposicionComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecomposicionComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(){
                    Prueba1();
                    Prueba2();
                    Prueba3();
                    Prueba4();
                        Prueba5();
                        Prueba6();
                    }
                }
            }
        }
    }
}

@Composable
fun Prueba1( modifier: Modifier = Modifier) {
    var valorModificar = 1
    Text(
        text = "P1 El valor es: ${valorModificar.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = { valorModificar++;}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}
@Composable
fun Prueba2( modifier: Modifier = Modifier) {
    val valorModificar: MutableState<Int> = remember { mutableStateOf(0) }
    Text(
        text = "P2 El valor es: ${valorModificar.value.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = { valorModificar.value++;}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}
@Composable
fun Prueba3( modifier: Modifier = Modifier) {
    val valorModificar: MutableState<Int> = remember { mutableStateOf(0) }
    Text(
        text = "P3 El valor es: ${valorModificar.value.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = { modificarValor(valorModificar);}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}

private fun modificarValor(valorModificar: MutableState<Int>) {
    valorModificar.value++
}

@Composable
fun Prueba4( modifier: Modifier = Modifier) {
    var valorModificar by remember { mutableStateOf(0) }
    Text(
        text = "P4 El valor es: ${valorModificar.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = { valorModificar++;}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}

@Composable
fun Prueba5( modifier: Modifier = Modifier) {
    var valorModificar by remember { mutableStateOf(0) }
    Text(
        text = "P5 El valor es: ${valorModificar.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = { modificarValorP5(valorModificar);}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}


private fun modificarValorP5(valorModificar: Int) {
    //valorModificar++;
    var valorModificar1 = valorModificar
    valorModificar1++
}
@Composable
fun Prueba6( modifier: Modifier = Modifier) {
    //val valorModificar by remember { mutableStateOf(0) }
    var valorModificar by remember { mutableStateOf(0) }
    Text(
        text = "P6 El valor es: ${valorModificar.toString()}",
        modifier = modifier.fillMaxWidth()
    )
    Button(
        onClick = {valorModificar= modificarValorP6(valorModificar);}
    ) {
        Text(text = "Boton incrementa en uno el valor")
    }
}


private fun modificarValorP6(valorModificar: Int): Int {
    //valorModificar++;
    var valorModificar1 = valorModificar
    valorModificar1++
    return valorModificar1++;
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecomposicionComposeTheme {
      //  Greeting("Android")
    }
}