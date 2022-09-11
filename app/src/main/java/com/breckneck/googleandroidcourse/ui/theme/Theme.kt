package com.breckneck.googleandroidcourse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//private val DarkColorPalette = darkColors(
//    surface = Blue,
//    onSurface = Navy,
//    primary = Navy,
//    onPrimary = Chartreuse
//
//
////    background = Color.DarkGray,
////    onBackground = Color.DarkGray,
////    onSurface = Color.DarkGray,
////    surface = Color.DarkGray
//)
//
//private val LightColorPalette = lightColors(
//    primaryVariant = Purple700,
//    secondary = Teal200,
//    surface = Blue,
//    onSurface = Color.White,
//    primary = LightBlue,
//    onPrimary = Navy
//
//
//
//    /* Other default colors to override
//    background = Color.White,
//    surface = Color.White,
//    onPrimary = Color.White,
//    onSecondary = Color.Black,
//    onBackground = Color.Black,
//    onSurface = Color.Black,
//    */
//)
//
//@Composable
//fun GoogleAndroidCourseTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    content: @Composable () -> Unit
//) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }
//
//    MaterialTheme(
//        colors = colors,
//        typography = Typography,
//        shapes = Shapes,
//        content = content
//    )
//}

//BasicLayoutsCompose

private val LightColorPalette = lightColors(
    primary = gray900,
    secondary = rust600,
    background = taupe100,
    surface = Color.White.copy(alpha = .85f),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = taupe800,
    onSurface = gray900.copy(alpha = 0.8f)
)

private val DarkColorPalette = darkColors(
    primary = Color.White,
    secondary = rust300,
    background = gray900,
    surface = Color.White.copy(alpha = 0.15f),
    onPrimary = gray900,
    onSecondary = gray900,
    onBackground = taupe100,
    onSurface = Color.White.copy(alpha = .8f)
)

@Composable
fun MySootheTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}