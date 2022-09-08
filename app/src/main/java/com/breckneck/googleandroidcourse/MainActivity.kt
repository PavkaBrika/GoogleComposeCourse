package com.breckneck.googleandroidcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.breckneck.googleandroidcourse.ui.theme.GoogleAndroidCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(msg = Message(first = "Android", second = "Jetpack Compose"))
        }
    }
}

data class Message(val first: String, val second: String)

@Composable
fun MessageCard(msg: Message) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "contact image",
            modifier = Modifier
                .size(75.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(text = msg.first)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = msg.second)
        }
    }

}