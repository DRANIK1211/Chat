package ru.druzhinin.chat.chatRegistration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.druzhinin.chat.ui.theme.ChatTheme


@Composable
fun ChatRegistration(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Chat",
            modifier = Modifier.padding(bottom = 5.dp),
            fontSize = 50.sp,
            fontWeight = FontWeight(500),
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(Color(85, 169, 157), Color(0, 118, 101))
                ),
            )
        )
        Text(
            text = "Registration",
            fontSize = 25.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(bottom = 30.dp)
        )
        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = "Enter your phone number",
                fontSize = 15.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier.padding(bottom = 5.dp),

            )
            val phoneNumber = remember { mutableStateOf("") }
            OutlinedTextField(
                value = phoneNumber.value,
                onValueChange = { phoneNumber.value = it },
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(28),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(246, 246, 246),
                    unfocusedContainerColor = Color(246, 246, 246),
                    unfocusedBorderColor = Color(246, 246, 246),
                    focusedBorderColor = Color(246, 246, 246)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )

            Text(
                text = "Create a password",
                fontSize = 15.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier.padding(bottom = 5.dp, top = 30.dp),

                )
            val pass = remember { mutableStateOf("") }
            OutlinedTextField(
                value = pass.value,
                onValueChange = { pass.value = it },
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(28),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(246, 246, 246),
                    unfocusedContainerColor = Color(246, 246, 246),
                    unfocusedBorderColor = Color(246, 246, 246),
                    focusedBorderColor = Color(246, 246, 246)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword)
            )

            Text(
                text = "Repeat password",
                fontSize = 15.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier.padding(bottom = 5.dp, top = 30.dp),

                )
            val repeat = remember { mutableStateOf("") }
            OutlinedTextField(
                value = repeat.value,
                onValueChange = { repeat.value = it },
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                shape = RoundedCornerShape(28),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(246, 246, 246),
                    unfocusedContainerColor = Color(246, 246, 246),
                    unfocusedBorderColor = Color(246, 246, 246),
                    focusedBorderColor = Color(246, 246, 246)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword)
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(85, 169, 157),
                                Color(0, 118, 101)
                            )
                        ),
                        shape = RoundedCornerShape(28.dp)
                    )
                    .height(ButtonDefaults.MinHeight + 10.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(
                    text = "Register",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400)
                )
            }

        }


    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun ChatRegistrationPreview(){
    ChatTheme {
        ChatRegistration()
    }
}