package com.example.sellproduct

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sellproduct.ui.theme.SellProductTheme
import com.example.sellproduct.ui.theme.bgdDetail
import com.example.sellproduct.ui.theme.bgdPl

@Composable
fun CartScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = bgdPl)
            .padding(12.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(20.dp))

        ProductItem()
        Spacer(modifier = Modifier.height(20.dp))

        ProductItem()
        Spacer(modifier = Modifier.height(20.dp))

        ProductItem()
        Spacer(modifier = Modifier.height(250.dp))

        TotalAndCheckout()
    }
}

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(Icons.Default.ArrowBack, contentDescription = "back")
        Text(
            text = "Giỏ hàng của bạn",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
        Spacer(modifier = Modifier.width(24.dp))
    }
}

@Composable
fun ProductItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            ProductImage()
            ProductDetails()
            QuantityControls()
        }
        Icon(
            Icons.Default.Delete,
            contentDescription = "removeItem",
            tint = Color.Red,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
                .size(24.dp)
        )
    }
}

@Composable
fun ProductImage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ip),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(Color.White)
        )
    }
}

@Composable
fun ProductDetails() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Iphone 15 Pro",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "21.000.000 VND",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Red
        )
    }
}

@Composable
fun QuantityControls() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 36.dp)
    ) {
        ControlButton(
            painter = painterResource(id = R.drawable.remove_24),
            contentDescription = "removeCart",
            modifier = Modifier.padding(horizontal = 5.dp)
        )

        Text(text = "1", fontSize = 13.sp)

        ControlButton(
            icon = Icons.Default.Add,
            contentDescription = "addCart",
            modifier = Modifier.padding(horizontal = 5.dp)
        )
    }
}

@Composable
fun ControlButton(
    painter: Painter? = null,
    icon: ImageVector? = null,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(45.dp, 17.dp)
            .padding(start = 7.dp, end = 7.dp)
            .border(BorderStroke(1.dp, Color.Gray), shape = RoundedCornerShape(16.dp))
    ) {
        if (painter != null) {
            Icon(painter = painter, contentDescription = contentDescription, modifier = modifier)
        } else if (icon != null) {
            Icon(icon, contentDescription = contentDescription, modifier = modifier)
        }
    }
}


@Composable
fun TotalAndCheckout() {
    Text(
        text = "Total: ...",
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )

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
            Text(text = "Checkout", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    SellProductTheme {
        CartScreen()
    }
}
