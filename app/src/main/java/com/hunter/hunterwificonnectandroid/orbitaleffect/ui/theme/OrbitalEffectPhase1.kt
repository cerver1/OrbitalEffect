package com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme

import android.R.attr.animation
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.UiUtils.FROM_CENTER
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun OrbitalEffectPhase1() {

    val angle = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        angle.animateTo(
            targetValue = 360f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 150_000, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            )
        )
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        val (px, py) = center.copy(x = this.center.x + FROM_CENTER, y = this.center.y + FROM_CENTER)

        val x = FROM_CENTER * cos(angle.value) + FROM_CENTER * sin(angle.value)
        val y = -FROM_CENTER * sin(angle.value) + FROM_CENTER * cos(angle.value)

        drawCircle(
            color = Color.Red,
            radius = 10F,
            center = center
        )

        drawCircle(
            color = Color.White,
            radius = 10F,
            center = Offset(px + x, py + y)
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