package com.example.a512lasalleapp.ui.screens

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Screens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
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
                    text = "Grades",
                    color = Color.White,
                    fontSize = 24.sp
                )
                Text(
                    text = "Student : Victor Manuel Quesada",
                    color = Color.White,
                    fontSize = 18.sp
                )
                Text(
                    text = "Career : Software engineering",
                    color = Color.White,
                    fontSize = 18.sp
                )
                Text(
                    text = "Semester : 5th",
                    color = Color.White,
                    fontSize = 18.sp
                )
                Text(
                    text = "GPA : 9.8",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }, body = {
        Column (
            modifier = Modifier.padding(15.dp).fillMaxWidth().height(600.dp)
        ){
            Text(
                text = "Courses",
                fontSize = 24.sp,
                modifier = Modifier.padding(10.dp)
            )

            Divider(modifier = Modifier.offset(y = -10.dp).padding(vertical = 10.dp))
            Row (
                modifier = Modifier.padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Python",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(horizontal = 65.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.GradesDetail.route+"/${1}") },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("View")
                }
            }
            Row (
                modifier = Modifier.padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Artificial inteligence",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(horizontal = 12.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.GradesDetail.route+"/${2}") },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("View")
                }
            }
            Row (
                modifier = Modifier.padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Android apps",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(horizontal = 40.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.GradesDetail.route+"/${3}") },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("View")
                }
            }
            Row (
                modifier = Modifier.padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Low level coding",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(horizontal = 28.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.GradesDetail.route+"/${4}") },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("View")
                }
            }
            Row (
                modifier = Modifier.padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Java coding",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.padding(horizontal = 45.dp))
                OutlinedButton (
                    onClick = { navController.navigate(Screens.GradesDetail.route+"/${5}")  },
                    modifier = Modifier.offset(y = -10.dp)
                ){
                    Text("View")
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
fun GradesScreenPreview() {
    val navController = rememberNavController()
    _512LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}