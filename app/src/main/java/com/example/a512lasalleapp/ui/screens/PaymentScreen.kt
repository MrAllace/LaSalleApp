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
            text = "Payments 2024",
            modifier = Modifier.padding(horizontal = 24.dp),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.W900
        )
        Divider(modifier = Modifier.offset(y = -10.dp).padding(vertical = 10.dp))
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "January",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "February",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "March",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "April",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "May",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "June",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "July",
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 78.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "August",
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 65.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "September",
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(horizontal = 49.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
                contentDescription = "Unchecked"
            )

        } // --------------------------------------------------------------
        Row (
            modifier = Modifier.padding(horizontal = 10.dp)
        ){
            Text(
                text = "October",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "November",
                modifier = Modifier.padding(horizontal = 16.dp),
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
                text = "December",
                modifier = Modifier.padding(horizontal = 16.dp),
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