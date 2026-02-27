package br.com.fiap.recipes.navigation

sealed class Destination(val route:String ){
    object InitialScreen:Destination("initial")
    object SignupScreen: Destination("signup")
    object HomeScreen: Destination("home/{email}"){
        fun createRoute(email: String) : String{
            return "home/$email"
        }
    }
    object LoginScreen: Destination("login")
    object CategoryRecipeScreen: Destination("categoryRecipes/{id}"){
        fun createRoute(id: Int): String {
            return "categoryRecipes/$id"
        }
    }
}