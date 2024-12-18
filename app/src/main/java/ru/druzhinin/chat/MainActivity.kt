package ru.druzhinin.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.druzhinin.chat.chatLogin.ChatLogin
import ru.druzhinin.chat.mainChats.Chats
import ru.druzhinin.chat.mainChats.components.status.UserStatus
import ru.druzhinin.chat.mainChats.components.status.components.SomeStatus
import ru.druzhinin.chat.mainChats.components.status.components.Status
import ru.druzhinin.chat.mainChats.components.status.components.defaultAvatarURL
import ru.druzhinin.chat.ui.theme.ChatTheme

val status = mutableListOf<Status>(
    Status(1, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(2, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(3, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(4, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(5, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(6, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),
    Status(7, ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL),

)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatTheme {
                Main()
            }
        }
    }
}



@Composable
fun Main() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            Chats(status = status)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Main()
}