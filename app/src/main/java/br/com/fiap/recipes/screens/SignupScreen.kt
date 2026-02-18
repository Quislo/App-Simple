package br.com.fiap.recipes.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.recipes.R
import br.com.fiap.recipes.ui.theme.RecipesTheme


@Composable
fun SignupScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)

    ){
        TopEndCard(modifier = Modifier.align(Alignment.TopEnd))
        BottomStartCard(modifier = Modifier.align(Alignment.BottomStart))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TitleComponent( )
            Spacer(modifier = Modifier.height(32.dp))
            UserImage()
            SigneupUserForm()

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)
@Composable
fun SignupScreenPreview(){
    RecipesTheme {
        SignupScreen()
    }
}
// *** Componente 1 - Título da tela ***
@Composable
fun TitleComponent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,//posiciona todos os elementos no centro vertical da Column.
        horizontalAlignment = Alignment.CenterHorizontally//alinha todo o conteúdo no centro horizontal da Column.
    ) {
        Text(
            text = stringResource(R.string.sign_up),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = stringResource(R.string.signup_subtitle),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)
@Composable
private fun TitleComponentPreview() {
    RecipesTheme {
        TitleComponent()
    }

}

// *** Componente 2 - Imagem do usuário
@Composable
fun UserImage(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .size(120.dp)
    ){
        Image(
            painter = painterResource(R.drawable.user),
            contentDescription = "",
            modifier = Modifier
                .size(110.dp)
                .align(Alignment.Center)
        )
        Icon(
            imageVector = Icons.Filled.AddAPhoto,
            tint = MaterialTheme.colorScheme.primary,
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.BottomEnd)
        )
    }

}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)
@Composable
private fun UserImagePreview() {
    RecipesTheme {
        UserImage()
    }
}



@Composable
fun SigneupUserForm(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
    ){
        // Caixa de texto para o nome do usuário
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            label = {
                Text(text = stringResource(R.string.your_name))
            },
            shape = RoundedCornerShape(16.dp),//Arredondar tudo
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.primary
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = stringResource(R.string.person_icon),
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                }
            )
        // Caixa de texto para o Email
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            label = {
                Text(text = stringResource(R.string.your_email))
            },
            shape = RoundedCornerShape(16.dp),//Arredondar tudo
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.primary
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Mail,
                    contentDescription = stringResource(R.string.icon_email),
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
        )
        // Caixa de texto para o Email
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            label = {
                Text(text = stringResource(R.string.passworld))
            },
            shape = RoundedCornerShape(16.dp),//Arredondar tudo
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.primary
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = stringResource(R.string.icon_passworld),
                    tint = MaterialTheme.colorScheme.tertiary,
                )
            },
            //Adicionar Icon no lado direito do textField
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.RemoveRedEye,
                    contentDescription = stringResource(R.string.icon_eye),
                    tint = MaterialTheme.colorScheme.tertiary

                )
            }
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = stringResource(R.string.signup_subtitle),
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.labelMedium
            )
        }


    }

}



@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)
@Composable
private fun SigneupUserFormPreview() {
    RecipesTheme {
        SigneupUserForm()
    }
}

