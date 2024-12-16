package ru.druzhinin.chat.mainChats.components.status

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import ru.druzhinin.chat.ui.theme.ChatTheme


@Composable
fun UserStatus(){
    LazyRow {
        item {
            // TODO("Создать несколько SomeStatus")
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
            UserStatus()
        }

    }
}