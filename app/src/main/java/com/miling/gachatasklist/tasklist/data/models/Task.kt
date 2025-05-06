package com.miling.gachatasklist.tasklist.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    //val taskList: Int,
    val title : String,
    val description: String,
    val status: Boolean
)
