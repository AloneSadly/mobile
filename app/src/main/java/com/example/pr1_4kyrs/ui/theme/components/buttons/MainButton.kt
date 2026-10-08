package com.example.pr1_4kyrs.ui.theme.components.buttons

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr1_4kyrs.ui.theme.Black
import com.example.pr1_4kyrs.ui.theme.White
import com.example.pr1_4kyrs.R

@Composable
fun MainButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = false,
    textInButton: String,
    textFontSize: Int

) {
    Button(
        modifier = modifier,
        onClick = {},
        enabled = enabled,
        colors = ButtonColors(
            containerColor = Black,
            contentColor = White,
            disabledContainerColor = Black,
            disabledContentColor = White
        ),
        shape = RoundedCornerShape(4.dp)

    ) {
        Text(
            text = textInButton,
            color = White,
            fontSize = textFontSize.sp,
            fontFamily = FontFamily(Font(R.font.gelasio_semibold_italic)),
            letterSpacing = 0.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MainButtonPrev() {
    MainButton(
        textInButton = "Get Started",
        textFontSize = 18

    )
}