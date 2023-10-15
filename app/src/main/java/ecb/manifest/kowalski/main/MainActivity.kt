package ecb.manifest.kowalski.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.material.icons.outlined.DirectionsCar
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.QrCode
import androidx.compose.material3.ExperimentalMaterial3Api
import dagger.hilt.android.AndroidEntryPoint
import ecb.manifest.kowalski.main.ui.drawer_menu.DrawerNavigationItem
import ecb.manifest.kowalski.main.ui.theme.ManifestKowalskiTheme
import ecb.manifest.kowalski.main.ui.drawer_menu.DrawerNavigationMenu
import ecb.manifest.kowalski.main.ui.navigation.MainScreenRoutes

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManifestKowalskiTheme {
                val navigationItems = listOf(
                    DrawerNavigationItem(
                        title = "Map",
                        selectedIcon = Icons.Filled.Place,
                        unselectedIcon = Icons.Outlined.Place,
                        route = MainScreenRoutes.Rating.route,
                    ),
                    DrawerNavigationItem(
                        title = "Payment",
                        selectedIcon = Icons.Filled.QrCode,
                        unselectedIcon = Icons.Outlined.QrCode,
                        route = MainScreenRoutes.Placeholder.route,
                    ),
                    DrawerNavigationItem(
                        title = "Car Diagnostics",
                        selectedIcon = Icons.Filled.DirectionsCar,
                        unselectedIcon = Icons.Outlined.DirectionsCar,
                        route = MainScreenRoutes.Placeholder.route,
                    ),
                )

                DrawerNavigationMenu(navigationItems = navigationItems)
            }
        }
    }
}
