package com.miling.gachatasklist.tasklist.data.repository

import com.miling.gachatasklist.tasklist.data.dao.TaskDao
import com.miling.gachatasklist.tasklist.domain.repository.TaskRepository

class TaskRepositoryImpl(
    private val taskDao: TaskDao
): TaskRepository {
}