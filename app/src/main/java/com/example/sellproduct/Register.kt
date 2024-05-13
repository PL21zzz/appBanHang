package com.example.sellproduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sellproduct.ui.theme.SellProductTheme

@Composable
fun registerScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bgi),
            contentDescription = "bgi",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        );
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(100.dp)
                .background(color = Color.Gray, shape = RectangleShape),
            painter = painterResource(id = R.drawable.person_24),
            contentDescription = "login image"
        );

        spacer(height = 4.dp);
        Text(text = "Register");

        spacer(height = 8.dp);
        OutlinedTextField(value = "", onValueChange = {}, shape = RoundedCornerShape(8.dp), label = {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.email_24),
                    contentDescription = "email",
                    Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                )
                Text(text = "Email")
            }
        });

        spacer(height = 8.dp);
        OutlinedTextField(value = "", onValueChange = {}, shape = RoundedCornerShape(8.dp), label = {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.person),
                    contentDescription = "username",
                    Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                )
                Text(text = "username")
            }
        });

        spacer(height = 8.dp);
        OutlinedTextField(value = "", onValueChange = {}, shape = RoundedCornerShape(8.dp), label = {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.key_24),
                    contentDescription = "pass",
                    Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                )
                Text(text = "password")
            }
        });

        spacer(height = 8.dp);
        OutlinedTextField(value = "", onValueChange = {}, shape = RoundedCornerShape(8.dp), label = {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.key_24),
                    contentDescription = "pass",
                    Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                )
                Text(text = "recent password")
            }
        });

        spacer(height = 8.dp);
        OutlinedTextField(value = "", onValueChange = {}, shape = RoundedCornerShape(8.dp), label = {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.phone_24),
                    contentDescription = "phone num",
                    Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                )
                Text(text = "phone number")
            }
        });

        spacer(height = 32.dp);
        Button(
            onClick = {
                  navController.navigate("login");
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 72.dp)
        ) {
            Text(text = "Register");
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SellProductTheme {
//        registerScreen();
//    }
//}