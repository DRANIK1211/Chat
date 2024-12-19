package ru.druzhinin.chat.mainChats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.druzhinin.chat.mainChats.components.status.UserStatus
import ru.druzhinin.chat.mainChats.components.status.components.Status
import ru.druzhinin.chat.mainChats.components.status.defaultAvatarURL
import ru.druzhinin.chat.mainChats.components.userChats.UserChats
import ru.druzhinin.chat.mainChats.components.userChats.components.Chat
import ru.druzhinin.chat.mainChats.components.userChats.components.htt
import ru.druzhinin.chat.ui.theme.ChatTheme


val status = mutableListOf<Status>(
    Status(1, defaultAvatarURL),
    Status(2, defaultAvatarURL),
    Status(3, defaultAvatarURL),
    Status(4, defaultAvatarURL),
    Status(5, defaultAvatarURL)
)
val chats = mutableListOf(
    Chat(1, htt, "asd"),
    Chat(2, htt, "sdfg"),
    Chat(3, htt, "dkj"),
    Chat(4, htt, "xcvn"),
)

@Composable
fun Chats(status: MutableList<Status>, chats: MutableList<Chat>){
    Column (
        modifier = Modifier


    ){
        Text(
            text = "Chat",
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(Color(85, 169, 157), Color(0, 118, 101))
                ),
            ),
            fontSize = 25.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Column {

            UserStatus(status = status)
            Spacer(modifier = Modifier.padding(5.dp))
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.padding(5.dp))
            UserChats(chats)

        }
    }

}


@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun ChatsPreview(){
    ChatTheme {
        Chats(status, chats)
    }
}