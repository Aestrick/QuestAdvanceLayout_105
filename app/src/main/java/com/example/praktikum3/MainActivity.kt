package com.example.praktikum3 // Package Anda dari screenshot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
// Import Tema Anda dari folder ui.theme
import com.example.praktikum3.ui.theme.Praktikum3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Nama Tema Anda (kemungkinan Praktikum3Theme)
            Praktikum3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // MENGGANTI "Greeting("Android")" DENGAN FUNGSI ANDA
                    ActivitasPertama(modifier = Modifier)
                }
            }
        }
    }
}