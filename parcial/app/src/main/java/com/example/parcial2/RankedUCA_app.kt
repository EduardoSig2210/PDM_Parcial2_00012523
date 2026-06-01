package com.example.parcial2

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.parcial2.Screens
import com.example.parcial2.pantalla.HomeScreen
import com.example.parcial2.pantalla.ResultScreen

@Composable
fun RankedUca_App(){
    val backStack = rememberNavBackStack(Screens.home)

    NavDisplay(
        backStack = backStack,
        onBack = {backStack.removeLastOrNull()},
        entryProvider = entryProvider {
            entry<Screens.home>{
                HomeScreen()
            }
            entry<Screens.result>{
                ResultScreen()
            }
        }
    )
}

