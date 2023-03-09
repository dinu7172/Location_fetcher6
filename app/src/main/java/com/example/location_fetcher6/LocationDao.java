package com.example.location_fetcher6;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LocationDao {

    @Insert
    void insert(LocationData locationData);

    @Query("SELECT * FROM locations")
    List<LocationData> getAllLocations();
}


