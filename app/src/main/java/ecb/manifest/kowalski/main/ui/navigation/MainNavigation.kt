package ecb.manifest.kowalski.main.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ecb.manifest.kowalski.main.ui.PlaceholderPage
import ecb.manifest.kowalski.rating.ui.navigation.RatingNavigation

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "rating") {
        composable(MainScreenRoutes.Rating.route) {
            RatingNavigation()
        }
        composable(MainScreenRoutes.Placeholder.route) {
            PlaceholderPage()
        }
    }
}
