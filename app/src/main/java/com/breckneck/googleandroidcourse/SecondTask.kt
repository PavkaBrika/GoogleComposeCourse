package com.breckneck.googleandroidcourse

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.breckneck.googleandroidcourse.R
import com.breckneck.googleandroidcourse.ui.theme.Shapes

@Composable
fun App() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    if (shouldShowOnboarding) {
        OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        Tables()
    }
}

@Composable
fun Tables() {
    var list = List(1000) {
        "$it"
    }
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
        items(items = list) { name ->
            Table(name = name)
        }
    }
}

@Composable
fun Table(name: String) {
    var expanded by rememberSaveable { mutableStateOf(false) }
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(4.dp),
        elevation = 1.dp,
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp)
            ) {
                Text(text = "Hello,", fontSize = 25.sp)
                Text(text = name, fontSize = 25.sp)
                if (expanded) {
                    Text(
                        text = ("Composem ipsum color sit lazy, " +
                                "padding theme elit, sed do bouncy. ").repeat(4)
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(
                onClick = { expanded = !expanded },
            ) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = if (expanded) stringResource(id = R.string.show_less) else stringResource(
                        id = R.string.show_more
                    )
                )
            }
        }
    }
}

@Composable
fun OnboardingScreen(onContinueClicked: () -> Unit) {
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