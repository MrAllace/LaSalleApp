package com.example.a512lasalleapp.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Screens

@Composable
fun SettingsScreen(innerPadding : PaddingValues, navController: NavController){
    //val student = studentsList.first { it.id == studentId }
    ScreenTemplate(innerPadding = innerPadding, header = {
        Row  (
            modifier = Modifier.padding(15.dp)
        ){
            Column (
                modifier = Modifier.padding(20.dp)
            )
            {
                Text(
                    text = "Settings",
                    color = Color.White,
                    fontSize = 24.sp
                )
                Text(
                    text = "Student : Victor Manuel",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    text = "Birth date : 12 / 08 / 2002",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    text = "Email : victor@hotmail.com",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://parspng.com/wp-content/uploads/2022/12/studentpng.parspng.com-9.png")
                    .build(),
                contentDescription = "Student",
                modifier = Modifier.fillMaxWidth()
                    .offset(y = 20.dp)
                    .clip(
                        RoundedCornerShape(
                        bottomStart = 25.dp,
                        bottomEnd = 25.dp,
                        topStart = 25.dp,
                        topEnd = 25.dp
                    )
                    ).background(Color.White)
                    .height(150.dp),
                contentScale = ContentScale.FillBounds
            )
        }


    }, body = {

        Column (
            modifier = Modifier.padding(10.dp).fillMaxWidth().height(600.dp)
        ){
            Text(
                text = "Options",
                fontSize = 24.sp,
                modifier = Modifier.padding(10.dp)
            )
            Row (
                modifier = Modifier.padding(10.dp)
            ){
                Text(
                    text = "Change password",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(25.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.ChangePassword.route) },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("Change")
                }
            }
            Row (
                modifier = Modifier.padding(10.dp)
            ){
                Text(
                    text = "Change theme",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(39.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.ChangeTheme.route)  },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("Change")
                }
            }

        }


    })
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SettingsScreenPreview() {
    val navController = rememberNavController()
    _512LaSalleAppTheme {
        SettingsScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}