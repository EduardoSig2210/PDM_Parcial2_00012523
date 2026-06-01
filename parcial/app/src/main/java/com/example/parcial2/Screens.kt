package com.example.parcial2

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class Screens: NavKey {
    @Serializable
    data object home: Screens(){

    }
    @Serializable
    data object result: Screens(){

    }
}