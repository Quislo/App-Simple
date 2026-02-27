package br.com.fiap.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.recipes.navigation.NavigationRoutes
import br.com.fiap.recipes.screens.LoginScreen
import br.com.fiap.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RecipesTheme {
                NavigationRoutes()
            }
        }
    }
}

@Preview
@Composable
fun MainActivityPreview() {
    RecipesTheme {
        NavigationRoutes()
    }
}
