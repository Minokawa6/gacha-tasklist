package com.miling.gachatasklist.tasklist.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert
import com.miling.gachatasklist.tasklist.data.models.TaskEntity

@Dao
interface TaskDao {

    @Upsert
    suspend fun upsertTask(taskEntity: TaskEntity)

    @Delete
    suspend fun deleteTask(taskEntity: TaskEntity)


}