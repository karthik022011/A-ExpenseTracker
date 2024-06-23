package com.karthik.expensetracker.screens.category.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.karthik.expensetracker.screens.category.model.Category


@Composable
fun CategoryItem(category: Category) {
    Text(text = category.name)
}