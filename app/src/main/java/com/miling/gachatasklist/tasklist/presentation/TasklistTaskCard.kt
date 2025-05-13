package com.miling.gachatasklist.tasklist.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miling.gachatasklist.R
import com.miling.gachatasklist.core.presentation.theme.GachaTasklistTheme

@Composable
fun TasklistTaskCard(modifier: Modifier = Modifier){
    Card(
        shape = RectangleShape,
        border = BorderStroke(1.dp, Color.Black),
        colors = CardColors(MaterialTheme.colorScheme.background, Color.Black, Color.Gray, Color.Gray),
        modifier = modifier
            .fillMaxWidth()
            .size(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(vertical = 1.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.check_box_outline_blank_24),
                    contentDescription = "Checkbox",
                    tint = Color.Gray
                )
                Text(
                    text = "task example lorem 1",
                    color = Color.Gray
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 1.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.check_box_outline_blank_24),
                    contentDescription = "Checkbox",
                    tint = Color.Gray
                )
                Text(
                    text = "task example lorem 1",
                    color = Color.Gray
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 1.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.check_box_outline_blank_24),
                    contentDescription = "Checkbox",
                    tint = Color.Gray
                )
                Text(
                    text = "task example lorem 1",
                    color = Color.Gray
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 1.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.check_box_outline_blank_24),
                    contentDescription = "Checkbox",
                    tint = Color.Gray
                )
                Text(
                    text = "task example lorem 1",
                    color = Color.Gray
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize( )
                .padding(bottom = 10.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 10.dp, x = (-10).dp),
                text = "tap to show more...",
                color = Color.Gray,
                textAlign = TextAlign.Right,
            )
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(height = 15.dp, width = 0.dp)
            ) {
                val cardWidth = size.width
                val cardHeight = size.height
                drawLine(
                    color = Color.Black,
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = (cardWidth / 2) - 100f, y = 0f),
                    strokeWidth = 3f
                )
                drawLine(
                    color = Color.Black,
                    start = Offset(x = (cardWidth / 2) - 100f, y = 0f),
                    end = Offset(x = (cardWidth / 2) - 60f, y = cardHeight),
                    strokeWidth = 3f
                )
                drawLine(
                    color = Color.Black,
                    start = Offset(x = (cardWidth / 2) - 60f, y = cardHeight),
                    end = Offset(x = cardWidth, y = cardHeight),
                    strokeWidth = 3f
                )
            }
            Text(text = "Test Title", modifier = Modifier.padding(start = 10.dp))
        }
    }
}

@Preview
@Composable
fun TasklistTaskCardPreview(){
    GachaTasklistTheme {
        TasklistTaskCard()
    }
}