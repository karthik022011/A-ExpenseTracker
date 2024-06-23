package com.karthik.expensetracker.utils.commoncomposables

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable


@Composable
fun MyTextButton(text:String,onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }
    ) {
        Text(text)
    }
}

