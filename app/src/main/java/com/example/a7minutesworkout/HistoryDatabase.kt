package com.example.a7minutesworkout
import androidx.room.Room
import androidx.room.Database
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [HistoryEntity::class], version = 1)

abstract class HistoryDatabase: RoomDatabase() {
    abstract fun historyDao():HistoryDao

    companion object {

        @Volatile
        private var INSTANCE: HistoryDatabase? = null


        fun getInstance(context: Context): HistoryDatabase {

            synchronized(this) {


                var instance = INSTANCE


                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HistoryDatabase::class.java,
                        "history_database"
                    )

                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}