package ru.druzhinin.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import ru.druzhinin.chat.mainChats.components.userChats.UserChats
import ru.druzhinin.chat.mainChats.components.userChats.components.Chat
import ru.druzhinin.chat.mainChats.components.userChats.components.SomeChat
import ru.druzhinin.chat.mainChats.components.userChats.components.htt
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
val chats = mutableListOf(
    Chat(1, htt, "asd"),
    Chat(2, htt, "sdfg"),
    Chat(3, htt, "dkj"),
    Chat(4, htt, "xcvn"),
    Chat(5, htt, "fsfh"),
    Chat(6, htt, "vcnuj"),
    Chat(7, htt, "xvbnjud"),
    Chat(8, htt, "xvbngjsgzn"),
    Chat(9, htt, "xbvh"),
    Chat(10, htt, "xcccccvn"),
    Chat(11, htt, ""),
    Chat(12, htt, "xcvn"),
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
        Column(modifier = Modifier.padding(innerPadding)){
            Chats(status, chats)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Main()
}