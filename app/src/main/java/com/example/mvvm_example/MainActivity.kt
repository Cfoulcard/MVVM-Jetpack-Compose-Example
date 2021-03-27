package com.example.mvvm_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        setContent {
//            Column(modifier = Modifier
//                .scrollable(
//                    orientation = Orientation.Vertical,
//                    state = rememberScrollState()
//                )
//                .background(Color.LightGray)
//                .fillMaxHeight()
//                .fillMaxWidth()
//            )
//             {
//
//                Image(
//                    painter = painterResource(id = R.drawable.nebula_two),
//                    contentDescription = null,
//                    modifier = Modifier.height(300.dp),
//                    contentScale = ContentScale.Crop,
//                )
//
//                Column(modifier = Modifier.padding(16.dp),
//                ) {
//                    Row(modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceBetween) {
//                        Text(
//                            "Stars",
//                            fontSize = 24.sp,
//                        )
//                        Spacer(modifier = Modifier.padding(top = 10.dp))
//
//                        Text(
//                            text = "1",
//                            style = TextStyle(fontSize = 18.sp),
//                            modifier = Modifier.align(alignment = Alignment.CenterVertically)
//                        )
//                    }
//                        Text(
//                            text = "Example Star",
//                            color = Color.DarkGray
//                        )
//                    Spacer(modifier = Modifier.padding(top = 10.dp))
//
//                    Button(onClick = {},
//                    modifier = Modifier.align(Alignment.CenterHorizontally)
//                    ) {
//                        Text(text = "SMASHING")
//                    }
//                    }
//                }
//            }
        }
    }
