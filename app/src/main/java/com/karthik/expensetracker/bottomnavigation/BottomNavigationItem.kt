package com.karthik.expensetracker.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = ScreenRoute.Home.route
            ),
            BottomNavigationItem(
                label = "Transaction",
                icon = Icons.Filled.Search,
                route = ScreenRoute.Transaction.route
            ),
            BottomNavigationItem(
                label = "Settings",
                icon = Icons.Filled.AccountCircle,
                route = ScreenRoute.Settings.route
            ),
        )
    }
}