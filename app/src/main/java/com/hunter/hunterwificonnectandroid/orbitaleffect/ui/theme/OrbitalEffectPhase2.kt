package com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hunter.hunterwificonnectandroid.orbitaleffect.ui.theme.UiUtils.ORB_COUNT
import kotlin.math.absoluteValue
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun OrbitalEffectPhase2() {

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

        val orbs = ORB_COUNT

        drawCircle(
            color = Color.Red,
            radius = 10F,
            center = center
        )

        for (i in 0 until orbs) {
            val shift = i * 0.0095F

            val x = UiUtils.FROM_CENTER * i * cos(angle + shift) + UiUtils.FROM_CENTER * i * sin(angle + shift) + px
            val y = -UiUtils.FROM_CENTER * i * sin(angle + shift) + UiUtils.FROM_CENTER * i * cos(angle + shift) + py
            //Spinning spiral coil shape
//            val x = UiUtils.FROM_CENTER * i * cos(angle + i) + UiUtils.FROM_CENTER * i * sin(angle + i) + px
//            val y = -UiUtils.FROM_CENTER * i * sin(angle + i) + UiUtils.FROM_CENTER * i * cos(angle + i) + py

            //moves on a 3d axis on the same plane
//            val x = UiUtils.FROM_CENTER * cos(angle + i) + UiUtils.FROM_CENTER * sin(angle + i) + px
//            val y = -UiUtils.FROM_CENTER + i * sin(angle + i) + UiUtils.FROM_CENTER + i * cos(angle + i) + py

            drawCircle(
                color = Color.White,
                radius = 10F,
                center = Offset(x , y)
            )

        }



    }

}

@Preview
@Composable
fun OrbitalEffectPhase2Preview() {

    OrbitalEffectTheme {
        OrbitalEffectPhase2()
    }
}