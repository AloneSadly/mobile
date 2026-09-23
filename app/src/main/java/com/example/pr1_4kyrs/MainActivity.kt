package com.example.pr1_4kyrs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr1_4kyrs.ui.theme.PR1_4kyrsTheme
import com.example.pr1_4kyrs.ui.theme.viewModel.ProductViewModel
import com.example.pr1_4kyrs.ui.theme.viewModel.UsersViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR1_4kyrsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = ""
    )
//    val userViewModel = UsersViewModel()
//    userViewModel.loadUsers()
    val productViewModel = ProductViewModel()
    productViewModel.loadProduct()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PR1_4kyrsTheme {
        Greeting("")
    }
}