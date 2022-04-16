package com.example.listaproduktow;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert
    void insertProduct(Product product);
    @Query("SELECT * FROM product")
    List<Product> getAllProduct();
    @Delete
    void deleteProduct(Product product);

}
