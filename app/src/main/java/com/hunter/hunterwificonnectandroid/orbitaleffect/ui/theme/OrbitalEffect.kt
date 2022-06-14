package com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme

import android.util.Size
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.core.util.component1
import androidx.core.util.component2
import kotlin.math.atan
import kotlin.math.atan2
import kotlin.math.sqrt

//@Composable
//fun OrbitalEffect() {
//
//    Canvas(modifier = Modifier.fillMaxSize()) {
//
//        center.createOrb()
//
//    }
//
//}
//
//fun Offset.createOrb(x: Float, y: Float) {
//
//    val (width, height) = this
//
//    var dx = (width/2) - x
//    var dy = (height/2) - y
//
//    var dist = sqrt(dx * dx + dy * dy)
//    var angle = atan2(dy.toDouble(), dx.toDouble())
//
//
//}