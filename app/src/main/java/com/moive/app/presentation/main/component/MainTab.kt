package com.moive.app.presentation.main.component

import androidx.annotation.DrawableRes
import com.moive.app.R.drawable.ic_launcher_background
import com.moive.app.core.navigation.MainTabRoute
import com.moive.app.core.navigation.Route
import com.moive.app.presentation.home.navigation.Home
import com.moive.app.presentation.mypage.navigation.MyPage

enum class MainTab(
    @DrawableRes val iconRes: Int,
    val titleRes: String,
    val route: MainTabRoute,
) {
    HOME(
        iconRes = ic_launcher_background,
        titleRes = "home",
        route = Home,
    ),

    MYPAGE(
        iconRes = ic_launcher_background,
        titleRes = "mypage",
        route = MyPage,
    );

    companion object {
        fun find(predicate: (MainTabRoute) -> Boolean): MainTab? {
            return entries.find { predicate(it.route) }
        }

        fun contains(predicate: (Route) -> Boolean): Boolean {
            return entries.any { predicate(it.route) }
        }
    }
}
