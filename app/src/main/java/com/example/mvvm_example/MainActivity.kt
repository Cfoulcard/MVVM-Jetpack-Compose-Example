package com.example.mvvm_example

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            Column(modifier = Modifier
                .scrollable(
                    orientation = Orientation.Vertical,
                    state = rememberScrollState())
                .background(Color.LightGray)
                .fillMaxHeight()
                .fillMaxWidth()
            )
             {

                Image(
                    painter = painterResource(id = R.drawable.nebula_two),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )

                Column(modifier = Modifier.padding(16.dp),
                ) {
                    Text("Stars",
                    fontSize = 24.sp,)
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    Text(text = "Example Star",
                    color = Color.DarkGray)
                }
            }

        }
    }
}