package com.miling.gachatasklist.tasklist.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miling.gachatasklist.ui.theme.GachaTasklistTheme

@Composable
fun TasklistTaskCard(modifier: Modifier = Modifier){
    Card(
        shape = RectangleShape,
        modifier = modifier
            .fillMaxWidth(0.8f)
            .size(150.dp)
            .padding(vertical = 5.dp)
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp)
        ) {
            Text(text = "testing")
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