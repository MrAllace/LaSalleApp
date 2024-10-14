package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.utils.studentsList

@Composable
fun GradesScreen(studentId : Int, innerPadding: PaddingValues) {
    val student = studentsList.first { it.id == studentId }
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Hola")
    }, body = {
        Text("Hola")
    })
}