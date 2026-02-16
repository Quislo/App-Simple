package br.com.fiap.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            RecipesTheme {

            }

        }
    }
}

@Composable
fun InitialScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize() //tamanho da tela
            .background(Color.White)
    ){
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(85.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 85.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFED1459)
            )
        ) { }
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(85.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 85.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFED1459)
            )
        ) { }
     Column (
         modifier = Modifier
             .padding(16.dp)
             .fillMaxWidth()// Adicionando espaçamento
             .align(Alignment.Center),
         horizontalAlignment = Alignment.CenterHorizontally
     ) {
         //Inserindo imagens
         Image(
             painter = painterResource(R.drawable.chef),
             contentDescription = "Imagem de um chefe cozinhando",
             modifier = Modifier
                 .size(190.dp) // Tamanho da imagem
         )
         // Componente espassador
         Spacer(modifier = Modifier.height(100.dp))
         Column (
             modifier = Modifier
                 .fillMaxWidth()
                 //.height(200.dp)
                 .align(Alignment.CenterHorizontally) // CORRIGIDO!
         ){
            Text(
                text = "RECEITAS ONLINE",
                fontSize = 16.sp,
                color = Color.Gray,


            )
             Text(
                 text = "Começando a cozinhar",
                 fontSize = 64.sp,
                 lineHeight = 64.sp, // Espassamento entre as linhas
                 fontWeight = FontWeight.Bold,
                 color = Color(0xFFED1459),
                // Texto em negrito
                 modifier = Modifier
                     .padding(top = 8.dp, bottom = 16.dp)
             )

             Row {
                 Button(
                     onClick = { },
                     colors = ButtonDefaults.buttonColors(
                         containerColor = Color(0xFFED1459),
                     ),
                     border = BorderStroke(
                         width = 1.dp,
                         color = Color(0xFFFFC107)
                     ),
                     modifier = Modifier
                         .size(width = 128.dp, height = 48.dp)

                 ) {
                     Text(
                         text = "Login",
                         fontSize = 16.sp,
                         fontWeight = FontWeight.Bold
                     )
                 }
                 Spacer(modifier = Modifier.width(8.dp))
                 Button(
                     onClick = { },
                     colors = ButtonDefaults.buttonColors(
                         containerColor = Color.Yellow
                     ),
                     border = BorderStroke(
                         width = 1.dp,
                         color = Color(0xFFED1459)
                     ),
                     modifier = Modifier
                         .size(width = 128.dp, height = 48.dp)


                 ) {
                     Text(
                         text = "Sign up",
                         fontSize = 16.sp,
                         fontWeight = FontWeight.Bold, // Negrito
                         color = Color(0xFFED1459)

                     )
                 }
             }
           }
        }
    }
}

@Composable
@Preview
fun InitialScreenPreview(showBackground: Boolean = true, showSystemUi: Boolean = true){
    RecipesTheme {
        InitialScreen()
    }
}
