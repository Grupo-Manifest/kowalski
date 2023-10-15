package ecb.manifest.kowalski.main.ui.navigation

sealed class MainScreenRoutes(val route: String) {
    object Rating : MainScreenRoutes("rating")
    object Placeholder : MainScreenRoutes("placeholder")
}
