package com.example.hww5d1.view.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [HotelEntity::class])
abstract class HotelDatabase : RoomDatabase(){
    abstract fun HotelDAO(): HotelDAO
}