package com.example.pr1_4kyrs.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr1_4kyrs.R
import com.example.pr1_4kyrs.ui.theme.White
import com.example.pr1_4kyrs.ui.theme.components.buttons.MainButton
import com.example.pr1_4kyrs.ui.theme.components.texts.ClickableText
import com.example.pr1_4kyrs.ui.theme.components.texts.InputFieldText

@Composable
fun LogInScreen(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    modifier.background(White)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start

    ) {
        Spacer(modifier = Modifier.weight(0.1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.rectangle), contentDescription = null
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(R.drawable.logo_in_login), contentDescription = null
            )
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(R.drawable.rectangle), contentDescription = null
            )
        }
        Spacer(modifier = Modifier.weight(0.1f))

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    fontFamily = FontFamily(Font(R.font.merriweather)),
                    fontWeight = FontWeight.Normal,
                    fontSize = 30.sp,
                    color = Color(0xFF909090)
                )) {
                    append("Hello !\n")
                }
                withStyle(style = SpanStyle(
                    fontFamily = FontFamily(Font(R.font.merriweather_bold)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color(0xFF303030),
                    letterSpacing = 1.2.sp
                )) {
                    append("WELCOME BACK")
                } },
            style = TextStyle(lineHeight = 45.sp),
            modifier = Modifier.padding(start = 30.dp)
        )
        Spacer(modifier = Modifier.height(25.dp))
        ElevatedCard(modifier = Modifier
            .width(345.dp)
            .heightIn(min = 437.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.elevatedCardColors(
                containerColor = White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp
            )){
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(35.dp))

                InputFieldText(
                    modifier = modifier.padding(horizontal = 30.dp),
                    value = email,
                    onValueChange = { email = it },
                    label = "Email",
                    visualTransformation = VisualTransformation.None,
                    trailingIcon = null
                )
                Spacer(modifier = Modifier.height(35.dp))
                InputFieldText(
                    modifier = modifier.padding(horizontal = 30.dp),
                    value = password,
                    onValueChange = { password = it },
                    label = "Password",
                    visualTransformation = VisualTransformation.None,
                )
                Spacer(modifier = Modifier.height(35.dp))
                ClickableText(
                    text = "Forgot Password",
                    onClick = {},
                    fontSize = 18
                )
                Spacer(modifier = Modifier.height(40.dp))
                MainButton(
                    modifier = Modifier.fillMaxWidth().padding(start = 30.dp,end = 30.dp).height(50.dp),
                    textInButton = "Log in",
                    textFontSize = 18,
                    enabled = true
                )
                Spacer(modifier = Modifier.height(35.dp))
                ClickableText(
                    text = "SIGN UP",
                    onClick = {},
                    fontSize = 18
                )
            }
        }
        Spacer(modifier = Modifier.weight(0.3f))
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LogInScreenPrev() {
    LogInScreen(

    )
}