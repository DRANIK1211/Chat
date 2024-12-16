package ru.druzhinin.chat.mainChats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import ru.druzhinin.chat.ui.theme.ChatTheme


@Composable
fun Chats(){
    Column {
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
        LazyColumn {
            item {
                UserStatus()
                // TODO("Добавить UserChats аналогично UserStatus")
            }
        }
    }

}


@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun ChatsPreview(){
    ChatTheme {
        Chats()
    }
}