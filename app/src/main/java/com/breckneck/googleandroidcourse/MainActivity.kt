package com.breckneck.googleandroidcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.breckneck.googleandroidcourse.ui.Conversation
import com.breckneck.googleandroidcourse.ui.SampleData
import com.breckneck.googleandroidcourse.ui.theme.GoogleAndroidCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleAndroidCourseTheme() {

                Surface() {
//                    MessageCard(msg = Message(first = "Android", second = "Jetpack Compose"))
//                    Conversation(messages = SampleData.conversationSample)
                    App()
                }
            }
        }
    }
}

