package ru.druzhinin.chat.mainChats.components.status

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import ru.druzhinin.chat.mainChats.components.status.components.SomeStatus
import ru.druzhinin.chat.mainChats.components.status.components.Status
import ru.druzhinin.chat.ui.theme.ChatTheme

val defaultAvatarURL =
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOuxrvcNMfGLh73uKP1QqYpKoCB0JLXiBMvA&s"

val status = mutableListOf<Status>(
    Status(1, defaultAvatarURL),
    Status(2, defaultAvatarURL),
    Status(3, defaultAvatarURL),
    Status(4, defaultAvatarURL),
    Status(5, defaultAvatarURL)
)

@Composable
fun UserStatus(status: MutableList<Status>){
    LazyRow {
        item {
            status.forEach{
                SomeStatus(status = it)
            }
        }
    }
}


@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun UserStatusPreview(){
    ChatTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            UserStatus(status = status)
        }

    }
}