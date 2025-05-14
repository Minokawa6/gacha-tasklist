package com.miling.gachatasklist.tasklist.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miling.gachatasklist.core.presentation.theme.GachaTasklistTheme

@Composable
fun TasklistDetails(modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ){
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .padding(top = 25.dp)
        ){
            items(2) {
                TasklistDetailsTaskRow(
                    title = "Task One"
                )
            }
            item{
                TasklistDetailsTaskRow(
                    title = "Task 2",
                    description = "A test description to describe Task 2",
                )
            }
            item{
                TasklistDetailsTaskRow(
                    title = "Task 3",
                    description = "This task is due tomorrow, prioritize finishing this task",
                    dueDate = "Tomorrow"
                )
            }
        }
    }


}

@Preview
@Composable
fun TasklistDetailPreview(){
    GachaTasklistTheme {
        TasklistDetails()
    }
}