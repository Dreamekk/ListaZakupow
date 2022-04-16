package com.example.listaproduktow;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = Product.class,exportSchema = false,version = 1)
public abstract class ProductDataBase extends RoomDatabase {
    private static final String Dbname = "Product DB";
    public abstract ProductDao productDao();
    private static ProductDataBase instance;
    public static ProductDataBase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),ProductDataBase.class,Dbname)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
