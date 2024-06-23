package com.karthik.expensetracker.screens.transactions.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    var transactionId: Int = 0,
    val amount: Long,
    val categoryType: String,
    val date: String,
    val note: String
)