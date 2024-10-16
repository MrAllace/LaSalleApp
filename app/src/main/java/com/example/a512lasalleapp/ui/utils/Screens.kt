package com.example.a512lasalleapp.ui.utils

sealed class Screens(val route : String) {
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object ChangePassword : Screens("settings-change_password")
    data object ChangeTheme : Screens("settings-change_theme")
    data object Settings : Screens("settings")
    data object NewsDetail: Screens("news-detail")
    data object GradesDetail: Screens("grades-detail")
}