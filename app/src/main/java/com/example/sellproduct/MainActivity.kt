package com.example.sellproduct

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sellproduct.ui.theme.SellProductTheme
import com.example.sellproduct.ui.theme.bgdHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController();
            NavHost(navController = navController, startDestination = "login", builder = {
                composable("login") {
                    loginScreen(navController);
                }

                composable("register") {
                    registerScreen(navController);
                }

                composable("home") {
                    homeScreen();
                }
            })
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("ComposableNaming", "UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun homeScreen() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Trang Chủ") }
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = bgdHome)
            ) {
                BannerSlider()
                PhoneProductList()
            }
        }
    }

    @Composable
    fun BannerSlider() {
        val bannerImages = listOf(
            R.drawable.banner1,
            R.drawable.banner2,
            R.drawable.banner3
        )

        var currentBannerIndex by remember { mutableStateOf(0) }

        LaunchedEffect(currentBannerIndex) {
            while (true) {
                delay(2000) // Delay for 3 seconds
                currentBannerIndex = (currentBannerIndex + 1) % bannerImages.size
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            Image(
                painter = painterResource(id = bannerImages[currentBannerIndex]),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
    }

    @Composable
    fun PhoneProductList() {
        val phoneProducts = listOf(
            PhoneProduct("Samsung Galaxy S21", R.drawable.ip, "$999"),
            PhoneProduct("iPhone 13", R.drawable.ip, "$1099"),
            PhoneProduct("Google Pixel 6", R.drawable.ip, "$799"),
            PhoneProduct("Google Pixel 6", R.drawable.ip, "$799"),
            // Add more phone products here...
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            items(phoneProducts) { product ->
                Column(
                    modifier = Modifier.padding(8.dp)
                ) {
                    PhoneProductItem(product)
                    Spacer(modifier = Modifier.height(12.dp))
                    // Spacer with a fixed height to create space between products
                }
            }
        }
    }

    @Composable
    fun PhoneProductItem(product: PhoneProduct) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = product.imageId),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
            Text(
                text = product.name,
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = product.price,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }
    }

    data class PhoneProduct(val name: String, val imageId: Int, val price: String)

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        SellProductTheme {
            homeScreen();
        }
    }
}