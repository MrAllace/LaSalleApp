package com.example.a512lasalleapp.ui.screens

import android.R.attr.text
import android.R.attr.value
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme


@Composable
fun ChangePasswordScreen(innerPadding: PaddingValues) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column (
            modifier = Modifier.padding(15.dp)
        ){
            Text(
                text = "Cambiar contraseña",
                fontSize = 24.sp,
                color = Color.White
            )
            Row (Modifier.padding(vertical = 15.dp)){
                Text(
                    text = "Inserta la nueva contraseña: ",
                    fontSize = 14.sp,
                    color = Color.White
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Nueva contraseña", fontSize = 12.sp) },
                    placeholder = { Text("example@domain.com") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth().height(40.dp),
                )
            }
            Row (Modifier.padding(vertical = 15.dp)){
                Text(
                    text = "Repite la nueva contraseña: ",
                    fontSize = 14.sp,
                    color = Color.White
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Nueva contraseña", fontSize = 12.sp) },
                    placeholder = { Text("example@domain.com") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth().height(40.dp),
                )
            }
            OutlinedButton(
                onClick = {},
            ) { Text(text = "Cambiar contraseña", color = Color.White) }


        }
    }, body = {

    }
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ChangePasswordScreenPreview() {
    _512LaSalleAppTheme {
        ChangePasswordScreen(innerPadding = PaddingValues(0.dp))
    }
}