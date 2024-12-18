package ru.druzhinin.chat.chatProfile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.serialization.Serializable
import ru.druzhinin.chat.ui.theme.ChatTheme




@Composable
fun ChatProfile() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            .fillMaxSize(),

    ){
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(),

            ) {
            Image(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.height(28.dp).width(28.dp)
            )
            Text(
                text = "Chat",
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(85, 169, 157), Color(0, 118, 101))
                    ),
                ),
                fontSize = 25.sp,
                fontWeight = FontWeight(500),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        val con = LocalConfiguration.current
        val sc = con.screenHeightDp
        val pad = sc / 20
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = pad.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Image(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    modifier = Modifier.height(25.dp).width(25.dp)
                )
            }
            Image(
                imageVector = Icons.Default.AccountCircle, // Должна быть картинка профиля
                contentDescription = null,
                modifier = Modifier.height(100.dp).width(100.dp)
            )
            var name = "Name Lastname"
            Text(
                text = name,
                fontSize = 25.sp,
                fontWeight = FontWeight(500),
                modifier = Modifier.padding(top = 10.dp)
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(top = 25.dp).fillMaxWidth()
            ) {
                var numPhone = "+7 (999) 999-99-99"
                var id = "123456789"
                var textStatus = "My status"
                var birthday = "01.01.2001"
                Text(
                    text = "Number phone: $numPhone",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "ID: $id",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "Status: $textStatus",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "Birthday: $birthday",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
            // TODO("add setting")
        }
    }

}


@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun ChatProfilePreview() {
    ChatTheme {
        ChatProfile()
    }
}