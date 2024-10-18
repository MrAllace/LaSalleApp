package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.coursesList

@Composable
fun PaymentScreen(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "YA PAGA WEY",
            modifier = Modifier.padding(horizontal = 24.dp),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.W900
        )
        Divider(modifier = Modifier.offset(y = -10.dp).padding(vertical = 10.dp))
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Enero",
                modifier = Modifier.padding(horizontal = 50.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 60.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Febrero",
                modifier = Modifier.padding(horizontal = 44.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 58.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Marzo",
                modifier = Modifier.padding(horizontal = 40.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 69.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Abril",
                modifier = Modifier.padding(horizontal = 39.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 76.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Mayo",
                modifier = Modifier.padding(horizontal = 35.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 77.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Junio",
                modifier = Modifier.padding(horizontal = 37.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 75.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Julio",
                modifier = Modifier.padding(horizontal = 37.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 78.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Agosto",
                modifier = Modifier.padding(horizontal = 41.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 65.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Septiembre",
                modifier = Modifier.padding(horizontal = 38.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 49.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_check_circle_outline_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Octubre",
                modifier = Modifier.padding(horizontal = 40.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 62.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Noviembre",
                modifier = Modifier.padding(horizontal = 38.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 52.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "Diciembre",
                modifier = Modifier.padding(horizontal = 41.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 52.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        }


    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PaymentScreenPreview() {
    _512LaSalleAppTheme {
        PaymentScreen(innerPadding = PaddingValues(0.dp))
    }
}