package ecb.manifest.kowalski

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
import ecb.manifest.kowalski.ui.navigation.DrawerNavigationItem
import ecb.manifest.kowalski.ui.theme.ManifestKowalskiTheme
import ecb.manifest.kowalski.ui.navigation.DrawerNavigationMenu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManifestKowalskiTheme {
                val navigationItems = listOf(
                    DrawerNavigationItem(
                        title = "Map",
                        selectedIcon = Icons.Filled.Place,
                        unselectedIcon = Icons.Outlined.Place,
                    ),
                    DrawerNavigationItem(
                        title = "Payment",
                        selectedIcon = Icons.Filled.QrCode,
                        unselectedIcon = Icons.Outlined.QrCode,
                    ),
                    DrawerNavigationItem(
                        title = "Car Diagnostics",
                        selectedIcon = Icons.Filled.DirectionsCar,
                        unselectedIcon = Icons.Outlined.DirectionsCar,
                    ),
                )

                DrawerNavigationMenu(navigationItems)
            }
        }
    }
}
