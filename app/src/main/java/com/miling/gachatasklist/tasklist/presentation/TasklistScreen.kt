package com.miling.gachatasklist.tasklist.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miling.gachatasklist.R
import com.miling.gachatasklist.core.presentation.customMod.fadingEdge
import com.miling.gachatasklist.core.presentation.theme.GachaTasklistTheme

@Composable
fun TasklistComposable(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Text(
                text = "Gacha Task List",
                fontSize = 20.sp,
                modifier = modifier
                    .weight(0.8f)
                    .padding(start = 10.dp)
                )
            Icon(
                painter = painterResource(id = R.mipmap.ic_menu),
                contentDescription = "menu"
            )
        }
        val topBottomFade = Brush.verticalGradient(0f to Color.Transparent, 0.1f to Color.Red, 0.9f to Color.Red, 1f to Color.Transparent)
        Box(
            modifier = Modifier
                .fadingEdge(topBottomFade)
                .background(MaterialTheme.colorScheme.background)
                .fillMaxWidth()
        ) {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                item {
                    Spacer(modifier = Modifier.size(50.dp))
                }
                items (5) {
                    TasklistTaskCard(
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .padding(vertical = 5.dp)
                    )
                }
                item {
                    Spacer(modifier = Modifier.size(50.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun TasklistComposablePreview(){
    GachaTasklistTheme {
        TasklistComposable()
    }
}