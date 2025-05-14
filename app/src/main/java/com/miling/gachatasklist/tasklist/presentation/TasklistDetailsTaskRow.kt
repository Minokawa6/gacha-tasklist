package com.miling.gachatasklist.tasklist.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miling.gachatasklist.R
import com.miling.gachatasklist.core.presentation.theme.GachaTasklistTheme

@Composable
fun TasklistDetailsTaskRow(
    modifier: Modifier = Modifier,
    title : String,
    description : String? = null,
    dueDate : String? = null
){
    Row (
       modifier = modifier
           .fillMaxWidth()
           .padding(vertical = 7.dp)
    ) {
        Icon(
            painter = painterResource( id = R.drawable.check_box_outline_blank_24),
            contentDescription = "Checkbox",
            modifier = Modifier

        )
        Column {
            Text(
                text = title,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth(),
                fontSize = 15.sp
            )
            if (description != null) {
                Text(
                    text = description,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 5.dp),
                    fontSize = 13.sp,
                    lineHeight = 15.sp
                )
            }
            Box(
                modifier = Modifier
                    .padding(start = 10.dp)
            ){
                if (dueDate != null) {
                    Text(
                        text = dueDate,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                            .padding(horizontal = 20.dp, vertical = 3.dp),
                        fontSize = 10.sp
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun TasklistDetailsTaskRowPreview(){
    GachaTasklistTheme {
        TasklistDetailsTaskRow(title = "Test task 1", description = "Test Description Test Description Test Description Test Description Test Description", dueDate = "Tomorrow")
    }
}