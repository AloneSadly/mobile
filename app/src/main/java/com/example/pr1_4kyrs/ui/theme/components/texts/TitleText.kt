package com.example.pr1_4kyrs.ui.theme.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pr1_4kyrs.R
import com.example.pr1_4kyrs.ui.theme.Gray

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: Int

) {
    Text(
        modifier = modifier,
        text = text,
        color = Gray,
        fontSize = fontSize.sp,
        letterSpacing = 0.sp,
        fontFamily = FontFamily(Font(R.font.nunito_sans)),
        lineHeight = 30.sp

    )
}

@Preview(showSystemUi = true)
@Composable
private fun TitleTextPrev() {
    TitleText(
        text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
        fontSize = 24
    )
}