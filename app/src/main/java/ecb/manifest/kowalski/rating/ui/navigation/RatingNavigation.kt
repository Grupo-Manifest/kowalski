package ecb.manifest.kowalski.rating.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ecb.manifest.kowalski.rating.ui.main.RatingMainScreen
import ecb.manifest.kowalski.rating.ui.presentation.review.ReviewScreen
import ecb.manifest.kowalski.rating.ui.viewModels.ReviewViewModel

@Composable
fun RatingNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "rating_main_screen") {
        composable(RatingScreen.RatingMainScreen.route) {
            val viewModel = hiltViewModel<ReviewViewModel>()
            RatingMainScreen(viewModel, navController)
        }
        composable(RatingScreen.ReviewScreen.route) {
            val viewModel = hiltViewModel<ReviewViewModel>()
            ReviewScreen(viewModel, navController)
        }
    }
}