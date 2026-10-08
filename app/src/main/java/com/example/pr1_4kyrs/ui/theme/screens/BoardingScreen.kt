package com.example.pr1_4kyrs.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr1_4kyrs.R
import com.example.pr1_4kyrs.ui.theme.components.buttons.MainButton
import com.example.pr1_4kyrs.ui.theme.components.texts.HeadlineText
import com.example.pr1_4kyrs.ui.theme.components.texts.MainText
import com.example.pr1_4kyrs.ui.theme.components.texts.TitleText

@Composable
fun BoardingScreen(modifier: Modifier = Modifier) {

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.mipmap.image_boarding_background3_foreground),
        contentDescription = null, contentScale = ContentScale.Crop
    )
    Column(
            modifier = Modifier.fillMaxSize().padding(30.dp),
        ) {
        Spacer(modifier = Modifier.weight(1.5f))
        HeadlineText(
            modifier = Modifier,
            text = "MAKE YOUR",
            fontSize = 24
        )
        Spacer(modifier = Modifier.height(15.dp))
        MainText(
            text = "HOME BEAUTIFUL",
            fontSize = 30
        )
        Spacer(modifier = Modifier.height(35.dp))
        TitleText(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
            fontSize = 18
        )
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            MainButton(
                modifier = Modifier.width(159.dp).height(54.dp),
                enabled = true,
                textInButton = "Get Started",
                textFontSize = 18
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
    }


@Preview(showSystemUi = true)
@Composable
private fun BoardingScreenPrev() {
    BoardingScreen()
}