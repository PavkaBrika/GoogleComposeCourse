package com.breckneck.googleandroidcourse

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    val list = listOf<String>("Kotlin", "Compose")
    Column(modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
        for (item in list) {
            Tables(name = item)
        }
    }
}


@Composable
fun Tables(name: String) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.padding(4.dp)) {
        Row(modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello,", fontSize = 25.sp)
                Text(text = name, fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedButton(
                onClick = { expanded.value = !expanded.value },
            ) {
                Text(text = if (expanded.value) "Show more" else "Show less")
            }
        }
    }
}