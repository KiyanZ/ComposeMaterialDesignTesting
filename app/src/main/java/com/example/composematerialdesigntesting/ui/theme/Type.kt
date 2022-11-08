package com.example.composematerialdesigntesting.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composematerialdesigntesting.R

// Set of Material typography styles to start with

val RobotoFont = FontFamily(
    Font(R.font.roboto_black, FontWeight.Black),
    Font(R.font.roboto_blackitalic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_medium,  FontWeight.Medium),
    Font(R.font.roboto_mediumitalic,  FontWeight.Medium, FontStyle.Italic),
    Font(R.font.roboto_thin, FontWeight.Thin),
    Font(R.font.roboto_thinitalic, FontWeight.Thin, FontStyle.Italic),
    Font(R.font.roboto_light, FontWeight.Light)
)
val Typography = Typography(
    defaultFontFamily = RobotoFont,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
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
)