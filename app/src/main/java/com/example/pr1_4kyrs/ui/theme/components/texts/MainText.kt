package com.example.pr1_4kyrs.ui.theme.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pr1_4kyrs.R
import com.example.pr1_4kyrs.ui.theme.BlackFont

@Composable
fun MainText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: Int
) {
    Text(
        text = text,
        color = BlackFont,
        fontSize = fontSize.sp,
        letterSpacing = 0.sp,
        fontFamily = FontFamily(Font(R.font.gelasio_medium_italic))
    )
}

@Preview(showSystemUi = true)
@Composable
private fun MainTextPrev() {
    MainText(
        text = "HOME BEAUTIFUL",
        fontSize = 30
    )
}