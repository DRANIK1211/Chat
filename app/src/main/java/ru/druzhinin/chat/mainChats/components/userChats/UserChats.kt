package ru.druzhinin.chat.mainChats.components.userChats

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.druzhinin.chat.mainChats.components.status.components.SomeStatus
import ru.druzhinin.chat.mainChats.components.userChats.components.Chat
import ru.druzhinin.chat.mainChats.components.userChats.components.SomeChat
import ru.druzhinin.chat.mainChats.components.userChats.components.htt
import ru.druzhinin.chat.ui.theme.ChatTheme

val chats = mutableListOf(
    Chat(1, htt, "asd"),
    Chat(2, htt, "sdfg"),
    Chat(3, htt, "dkj"),
    Chat(4, htt, "xcvn"),
)

@Composable
fun UserChats(chats: MutableList<Chat>){
    LazyColumn(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    ) {
        item {
            chats.forEach(){
                SomeChat(chat = it)
            }
        }
    }
}

@Preview
@Composable
fun UserChatsPreview(){
    ChatTheme {
        UserChats(chats)
    }
}