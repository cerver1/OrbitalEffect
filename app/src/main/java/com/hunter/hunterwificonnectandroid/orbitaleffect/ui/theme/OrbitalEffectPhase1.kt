package com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.UiUtils.FROM_CENTER
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun OrbitalEffectPhase1() {

    val infiniteTransition = rememberInfiniteTransition()

    val angle by infiniteTransition.animateFloat(
        initialValue = 0F,
        targetValue = 360F,
        animationSpec = infiniteRepeatable(
            animation = tween(200_000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        val (px, py) = center//.copy(x = this.center.x + FROM_CENTER, y = this.center.y + FROM_CENTER)

        val x = FROM_CENTER * cos(angle) + FROM_CENTER * sin(angle) + px
        val y = -FROM_CENTER * sin(angle) + FROM_CENTER * cos(angle) + py

        drawCircle(
            color = Color.Red,
            radius = 10F,
            center = center
        )

        drawCircle(
            color = Color.White,
            radius = 10F,
            center = Offset(x, y)
        )

    }

}

@Preview
@Composable
fun OrbitalEffectPhase1Preview() {

    OrbitalEffectTheme {
        OrbitalEffectPhase1()
    }
}