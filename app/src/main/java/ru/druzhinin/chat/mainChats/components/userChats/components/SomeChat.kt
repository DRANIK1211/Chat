package ru.druzhinin.chat.mainChats.components.userChats.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import ru.druzhinin.chat.R
import ru.druzhinin.chat.mainChats.components.status.components.SomeStatus
import ru.druzhinin.chat.ui.theme.ChatTheme

data class Chat(
    val id: Int,
    val icon: String,
    val name: String
)

val htt = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOuxrvcNMfGLh73uKP1QqYpKoCB0JLXiBMvA&s"

val chat = Chat(1, htt, "it")


@Composable
fun SomeChat(chat: Chat){
    Column(

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = chat.icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .border(1.dp, Color(255, 247, 247, 255), shape = CircleShape)
                    .padding(5.dp)
                    .clip(
                        shape = CircleShape
                    )
                    .width(60.dp)
                    .padding(10.dp)
            )
            Text(
                text = chat.name,
                fontSize = 25.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Black
        )
    }

}


@Preview
@Composable
fun SomeChatPreview(){
    ChatTheme {
        SomeChat(chat)
    }
}