package com.example.pr1_4kyrs.ui.theme.components.texts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr1_4kyrs.R
import com.example.pr1_4kyrs.ui.theme.Black
import com.example.pr1_4kyrs.ui.theme.Black3
import com.example.pr1_4kyrs.ui.theme.Gray
import com.example.pr1_4kyrs.ui.theme.InputBg

@Composable
fun InputFieldText(
    modifier: Modifier = Modifier,
    value: String,
    label: String,
    onClick: () -> Unit,
    onValueChange: (String) -> Unit,
    visualTransformation: VisualTransformation,
    placeholder: String,
    trailingIcon: @Composable (() -> Unit)? = {
        Image(painter = painterResource(id = R.drawable.eye_2), contentDescription = "")
    }
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = label,
            color = Black3,
            fontSize = 14.sp,
            letterSpacing = 0.sp,
            fontFamily = FontFamily(Font(R.font.nunito_sans))
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            visualTransformation = visualTransformation,
            trailingIcon = trailingIcon,
            placeholder = {
                Text(text = placeholder, color = Gray, fontSize = 16.sp)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = InputBg,
                unfocusedContainerColor = InputBg,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                cursorColor = InputBg,
                focusedTextColor = Black,
                unfocusedTextColor = Gray,
            ),
            shape = RoundedCornerShape(9.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(57.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = false)
@Composable
private fun InputFieldTextPrev() {
    var textState by remember { mutableStateOf("") }
    InputFieldText(
        value = textState,
        onValueChange = { textState = it },
        label = "Вход по email",
        placeholder = "example@mail.com",
        onClick = {},
        visualTransformation = VisualTransformation.None
    )

}