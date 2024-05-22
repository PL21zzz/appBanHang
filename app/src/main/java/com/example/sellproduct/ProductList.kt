package com.example.sellproduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sellproduct.ui.theme.SellProductTheme
import com.example.sellproduct.ui.theme.bgdPl

@Composable
fun ProductListDesign() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = bgdPl)
            .padding(12.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Icon(Icons.Default.ArrowBack, contentDescription = "back");
            Text(
                text = "Tên danh mục sản phẩm",
                modifier = Modifier
                    .weight(1.0f)
                    .padding(start = 8.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
            );
            Icon(Icons.Default.ShoppingCart, contentDescription = "cart");
        }

        Spacer(modifier = Modifier.height(16.dp));

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.drawable.ip),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.White)
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1.0f)
            ){
                Text(
                    text = "Iphone 15 Pro",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                );
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.money_24),
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Text(
                        text = "21.000.000 VND",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Red
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp));

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.drawable.ip),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.White)
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1.0f)
            ){
                Text(
                    text = "Iphone 15 Pro",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                );
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.money_24),
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Text(
                        text = "21.000.000 VND",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Red
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp));

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.drawable.ip),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.White)
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1.0f)
            ){
                Text(
                    text = "Iphone 15 Pro",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                );
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.money_24),
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Text(
                        text = "21.000.000 VND",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Red
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp));

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.drawable.ip),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.White)
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1.0f)
            ){
                Text(
                    text = "Iphone 15 Pro",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                );
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.money_24),
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Text(
                        text = "21.000.000 VND",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Red
                    )
                }
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun ProductListPreview() {
    SellProductTheme {
        ProductListDesign();
    }
}