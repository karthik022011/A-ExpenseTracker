package com.karthik.expensetracker.screens.category.composables


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.karthik.expensetracker.screens.category.model.Category
import androidx.compose.foundation.lazy.items


// Sample list of categories
val categoryList = listOf(
    Category("Category 1"),
    Category("Category 2"),
    Category("Category 3"),
    // Add more categories as needed
)

@Composable
fun CategoryList() {
    LazyColumn {
        items(items = categoryList){ category ->
            CategoryItem(category = category)
        }
    }
}