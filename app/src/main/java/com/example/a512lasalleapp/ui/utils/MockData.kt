package com.example.a512lasalleapp.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.a512lasalleapp.models.BottomNavigationItem
import com.example.a512lasalleapp.models.Community
import com.example.a512lasalleapp.models.Courses
import com.example.a512lasalleapp.models.News
import com.example.a512lasalleapp.models.Students
import java.util.Date

val coursesList = listOf(
    Courses(
        id = 1,
        name = "Python",
        gpa1 = 9.2F,
        gpa2 = 9.6F,
        gpa3 = 10F,
        gpa = 9.8F
    ),
    Courses(
        id = 2,
        name = "Redes",
        gpa1 = 10F,
        gpa2 = 10F,
        gpa3 = 10F,
        gpa = 10F
    ),
    Courses(
        id = 3,
        name = "Android",
        gpa1 = 9.5F,
        gpa2 = 9.1F,
        gpa3 = 8.8F,
        gpa = 9F
    ),
    Courses(
        id = 4,
        name = "Java",
        gpa1 = 8.6F,
        gpa2 = 6.6F,
        gpa3 = 9.8F,
        gpa = 8.9F
    ),
    Courses(
        id = 5,
        name = "Cristianismo",
        gpa1 = 9.8F,
        gpa2 = 9.9F,
        gpa3 = 10F,
        gpa = 9.9F
    ),
)

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val bottomNavBarItems = listOf(
    BottomNavigationItem(
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigationItem(
        title = "Calificaciones",
        icon = Icons.Default.Menu,
        route = Screens.Grades.route
    ),
    BottomNavigationItem(
        title = "Calendario",
        icon = Icons.Default.DateRange,
        route = Screens.Calendar.route
    ),
    BottomNavigationItem(
        title = "Configuración",
        icon = Icons.Default.Settings,
        route = Screens.Settings.route
    ),
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)