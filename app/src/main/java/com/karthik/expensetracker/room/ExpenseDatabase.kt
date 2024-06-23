package com.karthik.expensetracker.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.karthik.expensetracker.screens.transactions.entity.Transaction


@Database(
    entities = [Transaction::class],
    version = 1,
    exportSchema = false
)
abstract class ExpenseDatabase : RoomDatabase() {
    abstract fun appDao(): ExpenseDao
}