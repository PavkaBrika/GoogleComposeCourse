package com.breckneck.googleandroidcourse.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.breckneck.googleandroidcourse.R

// Set of Material typography styles to start with
//val Typography = Typography(
//    body1 = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp
//    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
//)

//BasicLayoutsCompose
private val fontFamilyKulim = FontFamily(
    listOf(
        Font(
            resId = R.font.kulim_park_regular
        ),
        Font(
            resId = R.font.kulim_park_light,
            weight = FontWeight.Light
        )
    )
)

private val fontFamilyLato = FontFamily(
    listOf(
        Font(
            resId = R.font.lato_regular
        ),
        Font(
            resId = R.font. lato_bold,
            weight = FontWeight.Bold
        )
    )
)

val typography = Typography(
    defaultFontFamily = fontFamilyLato,
    h1 = TextStyle(
        fontFamily = fontFamilyKulim,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = (1.15).sp
    ),
    h2 = TextStyle(
        fontFamily = fontFamilyKulim,
        fontSize = 15.sp,
        letterSpacing = (1.15).sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = (1.15).sp
    ),
    caption = TextStyle(
        fontFamily = fontFamilyKulim,
        fontSize = 12.sp,
        letterSpacing = (1.15).sp
    ),
)