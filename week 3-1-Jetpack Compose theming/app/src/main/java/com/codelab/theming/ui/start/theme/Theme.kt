package com.codelab.theming.ui.start.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.codelab.theming.ui.finish.theme.*

private val LightColors = lightColors(
    primary = green_1,
    primaryVariant = green_2,
    onPrimary = Color.White,
    secondary = green_1,
    secondaryVariant = green_4,
    onSecondary = Color.White,
    error = green_3
)

private val DarkColors = darkColors(
    primary = green_1,
    primaryVariant = green_2,
    onPrimary = Color.Black,
    secondary = green_1,
    onSecondary = Color.Black,
    error = green_5
)

@Composable
fun myTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = myTypography,
        shapes = myShape,
        content = content
    )
}