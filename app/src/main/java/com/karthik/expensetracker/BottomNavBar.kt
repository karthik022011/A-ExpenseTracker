package com.karthik.expensetracker

import androidx.compose.runtime.Composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.karthik.expensetracker.bottomnavigation.BottomNavigationItem
import com.karthik.expensetracker.bottomnavigation.ScreenRoute
import com.karthik.expensetracker.screens.home.HomeScreen
import com.karthik.expensetracker.screens.settings.SettingsScreen
import com.karthik.expensetracker.screens.transactions.TransactionScreen

@Composable
fun BottomNavigationBar() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                BottomNavigationItem().bottomNavigationItems().forEachIndexed { _, navigationItem ->
                    NavigationBarItem(
                        selected = navigationItem.route == currentDestination?.route,
                        label = {
                            Text(navigationItem.label)
                        },
                        icon = {
                            Icon(
                                navigationItem.icon,
                                contentDescription = navigationItem.label
                            )
                        },
                        onClick = {
                            navController.navigate(navigationItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) {paddingValues ->
        NavHost(
            navController = navController,
            startDestination = ScreenRoute.Home.route,
            modifier = Modifier.padding(paddingValues = paddingValues)) {
            composable(ScreenRoute.Home.route) {
                HomeScreen(
                    navController
                )
            }
            composable(ScreenRoute.Transaction.route) {
                TransactionScreen(
                    navController
                )
            }
            composable(ScreenRoute.Settings.route) {
                SettingsScreen(
                    navController
                )
            }
        }
    }
}