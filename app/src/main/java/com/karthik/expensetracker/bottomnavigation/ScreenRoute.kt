package com.karthik.expensetracker.bottomnavigation


sealed class ScreenRoute(val route: String) {
    data object Home : ScreenRoute("home_route")
    data object Transaction : ScreenRoute("transaction_route")
    data object Settings : ScreenRoute("settings_route")
    data object Category : ScreenRoute("category_route")
}

