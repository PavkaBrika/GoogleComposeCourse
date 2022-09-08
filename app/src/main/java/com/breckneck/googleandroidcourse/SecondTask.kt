package com.breckneck.googleandroidcourse

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    val list = listOf<String>("kotlin", "COmpose")
    Column(modifier = Modifier.padding(4.dp)) {
        for (item in list) {
            Tables(name = item)
        }
    }
}


@Composable
fun Tables(name: String) {
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.padding(4.dp)) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
        ) {
            Text(text = "HELLO", fontSize = 25.sp)
            Text(text = name, fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.width(8.dp))
    }
}