package com.example.sellproduct

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sellproduct.ui.theme.SellProductTheme
import com.example.sellproduct.ui.theme.bgdDetail
import com.example.sellproduct.ui.theme.bgdPl

@Composable
fun CheckoutScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = bgdPl)
            .padding(12.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(Icons.Default.ArrowBack, contentDescription = "back")
            Text(
                text = "Thanh Toán",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(24.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                Icons.Default.AccountCircle,
                contentDescription = "account",
                tint = Color.Red,
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
            )
            Text(
                text = "nguyen van a",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(24.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                Icons.Default.Email,
                contentDescription = "email",
                tint = Color.Red,
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
            )
            Text(
                text = "abc@gmail.com",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(24.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                Icons.Default.Call,
                contentDescription = "call",
                tint = Color.Red,
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
            )
            Text(
                text = "123456",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(24.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.money_24),
                contentDescription = null,
                tint = Color.Red
            )
            Text(
                text = "Tổng: ...",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(24.dp))
        }

        OutlinedTextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.LocationOn,
                        contentDescription = "location",
                        tint = Color.Red,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(24.dp)
                    )
                    Text(text = "location")
                }
            });

        Spacer(modifier = Modifier.weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1.0f),
                colors = ButtonDefaults.buttonColors(containerColor = bgdDetail)
            ) {
                Text(text = "Book now", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    SellProductTheme {
        CheckoutScreen()
    }
}