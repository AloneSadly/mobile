package com.example.pr1_4kyrs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr1_4kyrs.ui.theme.PR1_4kyrsTheme
import com.example.pr1_4kyrs.ui.theme.viewModel.RecipesViewModel
import com.example.pr1_4kyrs.ui.theme.viewModel.UsersViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR1_4kyrsTheme {
//              val productt = Product(
//                  title = "Робот-пылесос CleanBot Max",
//                  price = 33600.00,
//                  dimensions = Dimension(
//                      350.00,
//                      350.00,
//                      95.00,
//                  ),
//                  weight = 4
//              )


              val userViewModel: UsersViewModel = viewModel()
//              userViewModel.loadUsers()
// 17 PR
                userViewModel.deleteUsers(15)
// 15 PR
//              val createProductViewModel:ProductViewModel = viewModel()
//              createProductViewModel.createProduct(productt)
// 16 PR
//                val updateRecipesViewModel: RecipesViewModel = viewModel()
//                updateRecipesViewModel.updateRecipes(11)



            }
        }
    }
}