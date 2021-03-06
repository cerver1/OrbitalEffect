package com.hunter.hunterwificonnectandroid.orbitaleffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.OrbitalEffectPhase1
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.OrbitalEffectPhase2
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.OrbitalEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrbitalEffectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OrbitalEffectPhase2()
                }
            }
        }
    }
}
