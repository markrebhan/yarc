package com.mrebhan.yarc.ui.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mrebhan.yarc.ui.navigation.NAV_HOME

/**
 * Entry point for the Main Activities Navigation Graph
 */
@Composable
fun MainNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = NAV_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(NAV_HOME) {
            Listings()
        }
    }
}