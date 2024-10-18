package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ChangeThemeScreen(innerPadding: PaddingValues) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Row (
            modifier = Modifier.padding(40.dp)
        ){
            Text(text = "Cambiar tema", color = Color.White)
            Switch(
                modifier = Modifier.offset(y = -15.dp, x = 15.dp),
                checked = true,
                onCheckedChange = {
                }
            )

        }
    }, body = {}
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ChangeThemeScreenPreview() {
    _512LaSalleAppTheme {
        ChangeThemeScreen(innerPadding = PaddingValues(0.dp))
    }
}