package ru.druzhinin.chat.mainChats.components.status

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    val density = LocalDensity.current.density
    val screenWidthPx = LocalContext.current.resources.displayMetrics.widthPixels / density
    val startX = screenWidthPx - screenWidthPx/ 30
    Box(modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        .padding(top = 10.dp)
    ){
        LazyRow (){
            item {
                status.forEach{

                    SomeStatus(status = it)

                }

            }
        }
//        Box(
//            modifier = Modifier
//                .background(
//                    brush = Brush.horizontalGradient(
//                        colors = listOf(
//                            Color(255, 255, 255, 0),
//                            Color(255, 255, 255, 200),
//                        ),
//                        startX = screenWidthPx - (screenWidthPx / 10),
//                        endX = screenWidthPx
//                    )
//                )
//                .fillMaxWidth()
//                .height(100.dp)
//        )
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