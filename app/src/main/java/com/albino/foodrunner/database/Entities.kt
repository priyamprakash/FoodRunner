package com.albino.foodrunner.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="restaurants")//will tell the compiler that it is an entity class
data class RestaurantEntity (
    @ColumnInfo(name="restaurant_id") @PrimaryKey var restaurantId:String,
    @ColumnInfo(name="restaurant_name")var restaurantName:String
)