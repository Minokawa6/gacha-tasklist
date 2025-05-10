package com.miling.gachatasklist.tasklist.domain.models

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val status: Boolean
){

}
