package com.example.parcial2.pantalla

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.parcial2.data.local.Restaurante

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val listaRestaurante: List<Restaurante>
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = { Text("RankeUca - Vota") },
            )
        }

    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Home Screen")
        }

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xF2FFE8BF),
                contentColor = Color.White
            ),

            shape = RoundedCornerShape(12.dp),

            modifier = Modifier
                .width(280.dp)
                .height(55.dp),

            onClick = {

            }
        ) {
            Text("Iniciar Sesion", color = Color.Black)
        }
    }
}
