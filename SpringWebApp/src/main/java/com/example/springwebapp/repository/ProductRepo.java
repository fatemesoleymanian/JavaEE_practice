package com.example.springwebapp.repository;

import com.example.springwebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                                 //primary key type : Integer
public interface ProductRepo extends JpaRepository<Product, Integer> {


}
