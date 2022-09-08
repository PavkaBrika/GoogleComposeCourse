package com.breckneck.googleandroidcourse

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.breckneck.googleandroidcourse.ui.theme.GoogleAndroidCourseTheme

@Composable
fun App() {
    var shouldShowOnboarding by remember { mutableStateOf(true)}

    if (shouldShowOnboarding) {
        OnboardingScreen(onContinueClicked = {shouldShowOnboarding = false})
    } else {
        Tables()
    }
}

@Composable
fun Tables() {
//    val list = listOf<String>("Kotlin", "Compose")
    var list = List(1000) {
        "$it"
    }
    Column(modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
        for (item in list) {
            Table(name = item)
        }
    }
}

@Composable
fun Table(name: String) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.padding(4.dp)) {
        Row(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
        ) {
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

@Composable
fun OnboardingScreen(onContinueClicked: () -> Unit) {
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to the Basics Codelab!")
            Button(
                onClick = onContinueClicked,
                modifier = Modifier.padding(vertical = 24.dp)
            ) {
                Text(text = "Continue")
            }
        }
    }
}