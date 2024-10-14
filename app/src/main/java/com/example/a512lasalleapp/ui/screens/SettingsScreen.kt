package com.example.a512lasalleapp.ui.screens


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.studentsList

@Composable
fun SettingsScreen(studentId : Int, innerPadding : PaddingValues){
    val student = studentsList.first { it.id == studentId }
    ScreenTemplate(innerPadding = innerPadding, header = {
        Row (
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){  }
        Text(text = "Student")
    }, body = {
        Text("Hola")
    })
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SettingsScreenPreview() {
    _512LaSalleAppTheme {
        SettingsScreen(0, innerPadding = PaddingValues(0.dp))
    }
}