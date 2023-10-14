package ecb.manifest.kowalski.rating.ui.navigation

sealed class RatingScreen(val route: String) {
    object RatingMainScreen : RatingScreen("main_screen")
    object ReviewScreen : RatingScreen("review_screen")
}
