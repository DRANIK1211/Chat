package ru.druzhinin.chat.mainChats.components.status.components

import android.media.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import ru.druzhinin.chat.R
import ru.druzhinin.chat.ui.theme.ChatTheme

// TODO("Создать data class со статусом пользователя, аватврка, номер")
// TODO("Вывести 1 из них")
val defaultAvatarURL =
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOuxrvcNMfGLh73uKP1QqYpKoCB0JLXiBMvA&s"

data class Status(
    val id: Int,
    val avatar: String
)

val status = Status(123, defaultAvatarURL)


@Composable
fun SomeStatus(status: Status) {
    AsyncImage(
        model = status.avatar,
        contentDescription = null,
        modifier = Modifier
            .padding(end = 5.dp)
            .border(3.dp, Color.Green, CircleShape)
            .padding(5.dp)
            .clip(
                shape = CircleShape
            )
            .width(70.dp)
            .padding(10.dp)


        ,
        placeholder = painterResource(R.drawable.ic_launcher_background)
    )
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun SomeStatusPreview() {
    ChatTheme {
        SomeStatus(status)
    }
}
