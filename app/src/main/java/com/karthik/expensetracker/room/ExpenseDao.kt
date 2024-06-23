package com.karthik.expensetracker.room


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.karthik.expensetracker.screens.transactions.entity.Transaction

@Dao
interface ExpenseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Transaction)


}