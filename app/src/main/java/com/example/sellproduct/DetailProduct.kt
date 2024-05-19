package com.example.sellproduct

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sellproduct.ui.theme.SellProductTheme
import com.example.sellproduct.ui.theme.bgdDetail

@Composable
fun Detail() {
    Box (
        contentAlignment = Alignment.BottomStart
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = bgdDetail)
        ) {
            Column (
                modifier = Modifier.weight(0.4f)
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(Icons.Default.ArrowBack, contentDescription = "back", tint = Color.White);
                    Text(
                        text = "Chi tiết sản phẩm",
                        modifier = Modifier
                            .weight(1.0f)
                            .padding(start = 8.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    );
                    Icon(Icons.Default.ShoppingCart, contentDescription = "cart", tint = Color.White);
                }
                Row (
                    modifier = Modifier
                        .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 0.dp)
                        .fillMaxSize()
                ){
                    Column(modifier = Modifier
                        .padding(top = 12.dp)
                        .weight(1.0f)) {
                        Text(text = "Product name: ", color = Color.White);
                        Text(text = "IPhone 15", fontSize = 21.sp, color = Color.White);
                        spacer(height = 48.dp)
                        Text(text = "Product price: ", color = Color.White);
                        Text(text = "21.000.000 VND", fontSize = 21.sp, color = Color.White);
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(1.0f)
                            .size(200.dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ip),
                            contentDescription = "product image",
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = Color.White, shape = CircleShape)
                                .clip(shape = CircleShape)
                                .padding(start = 12.dp)
                        )
                    }

                }
            }

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.6f)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                    )
                    .padding(vertical = 48.dp, horizontal = 12.dp)
            ){
                Text(
                    text = "Describe:",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                );
                Text(
                    text = stringResource(id = R.string.describe),
                    fontWeight = FontWeight.W300,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(vertical = 12.dp)
                )

                //Image(painter = painterResource(id = R.drawable.ip), contentDescription = null, modifier = Modifier.padding(vertical = 36.dp));
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(vertical = 36.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(70.dp, 40.dp)
                            .padding(end = 16.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                shape = RoundedCornerShape(16.dp)
                            )
                    ){
                        Icon(
                            painter = painterResource(id = R.drawable.remove_24),
                            contentDescription = "addCart",
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp));

                    Text(text = "1", fontSize = 25.sp)

                    Spacer(modifier = Modifier.width(12.dp));

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(70.dp, 40.dp)
                            .padding(start = 16.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                shape = RoundedCornerShape(16.dp)
                            )
                    ){
                        Icon(
                            Icons.Default.Add,
                            contentDescription = "addCart",
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }
                }

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(70.dp, 40.dp)
                            .padding(end = 16.dp)
                            .border(
                                BorderStroke(1.dp, bgdDetail),
                                shape = RoundedCornerShape(16.dp)
                            )
                    ){
                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "addCart",
                            modifier = Modifier.padding(horizontal = 12.dp),
                            tint = bgdDetail
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.weight(1.0f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = bgdDetail
                        )
                    ) {
                        Text(text = "Buy now", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    SellProductTheme {
        Detail();
    }
}