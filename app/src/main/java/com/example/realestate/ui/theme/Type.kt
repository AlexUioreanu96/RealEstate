package com.example.realestate.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.realestate.R

val gothamssmBoldFont = FontFamily(Font(R.font.gothamssm_bold))
val gothamssmMediumFont = FontFamily(Font(R.font.gothamssm_medium))
val gothamssmBookFont = FontFamily(Font(R.font.gothamssm_book))
val gothamssmLightFont = FontFamily(Font(R.font.gothamssm_bold))

val typography = Typography(
    titleLarge = TextStyle(
        fontFamily = gothamssmBoldFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    titleMedium = TextStyle(
        fontFamily = gothamssmBoldFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = gothamssmMediumFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = gothamssmBookFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = gothamssmBookFont,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    bodySmall = TextStyle(
        fontFamily = gothamssmBookFont,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = gothamssmLightFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)
