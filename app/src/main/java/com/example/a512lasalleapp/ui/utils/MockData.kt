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

val studentsList = listOf(
    Students(
        id = 1,
        name = "Victor Quezada Feregrino",
        birthDate = Date(2002 + 1900,2,21),
        career = "Software Engineering",
        semester = 5,
        email = "victor@hotmail.com",
        courses = mutableListOf(
            Courses(1,"Python",10F,9.2F,8.1F, 9.1F),
            Courses(2,"Kotlin",9.8F,8.1F,9.7F,8.7F),
            Courses(3,"C",9.9F,10F,10F,9.9F),
            Courses(4,"Vulkan",10F,10F,10F,10F)),
        gpa = 9.6F,
        image = "https://yt3.googleusercontent.com/sNaVUqr3t-QV4Yh_t-Bk_hMPO_puyWUNmQPuFrSoPGaa_HfNPB38q7XaaNrmbm27woBv0JJMmj4=s900-c-k-c0x00ffffff-no-rj"
    ),
    Students(
        id = 1,
        name = "Samuel Rodriguez",
        birthDate = Date(2002 + 1900,8,5),
        career = "Civil Engineering",
        semester = 3,
        email = "samrodriguez@hotmail.com",
        courses = mutableListOf(
            Courses(5,"Calculus",9F,7.1F,8.2F, 7.5F),
            Courses(6,"Static",6.2F,5.1F,7.1F,8.7F),
            Courses(7,"Thermodynamics",9.1F,8.1F,5.1F,6.5F),
            Courses(1,"Python",7.2F,8.3F,10F,9.2F)),
        gpa = 8.5F,
        image = "https://yt3.googleusercontent.com/sNaVUqr3t-QV4Yh_t-Bk_hMPO_puyWUNmQPuFrSoPGaa_HfNPB38q7XaaNrmbm27woBv0JJMmj4=s900-c-k-c0x00ffffff-no-rj"
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
        title = "Home",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigationItem(
        title = "Grades",
        icon = Icons.Default.Menu,
        route = Screens.Grades.route
    ),
    BottomNavigationItem(
        title = "Calendar",
        icon = Icons.Default.DateRange,
        route = Screens.Calendar.route
    ),
    BottomNavigationItem(
        title = "Settings",
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