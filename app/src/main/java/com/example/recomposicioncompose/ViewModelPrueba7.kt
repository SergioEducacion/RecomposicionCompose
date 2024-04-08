package com.example.recomposicioncompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewModelPrueba7 : ViewModel() {
    private val _uiState = MutableStateFlow(UiStatePrueba7())
    val uiState: StateFlow<UiStatePrueba7> = _uiState.asStateFlow()




fun aumentarElValorEnUno()
{
    var nuevoValor= _uiState.value.valor
    var nuevoValorEntero = nuevoValor.toInt()
    nuevoValorEntero++
    nuevoValor=nuevoValorEntero.toString()
    ActualizarUiState(nuevoValor);


}

    private fun ActualizarUiState(nuevoValor: String) {

        _uiState.update { currentState ->
            currentState.copy(
            valor=nuevoValor
            )
        }
    }

}