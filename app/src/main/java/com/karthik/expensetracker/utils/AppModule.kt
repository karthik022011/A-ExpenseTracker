package com.karthik.expensetracker.utils

import android.content.Context
import androidx.room.Room
import com.karthik.expensetracker.room.ExpenseDao
import com.karthik.expensetracker.room.ExpenseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

 /*Now we are telling hilt to provide instance of database*/
 @Provides
 @Singleton
 fun provideAppDatabase(@ApplicationContext appContext: Context): ExpenseDatabase {
     return  Room.databaseBuilder(
           appContext,
         ExpenseDatabase::class.java,
         MyAppConstants.DATABASE_NAME
     ).build()
 }

 /*Now we are telling hilt to provide instance of dao*/
 @Provides
 fun provideAppDatabaseDao(appDatabase: ExpenseDatabase): ExpenseDao {
  return appDatabase.appDao()
 }




}