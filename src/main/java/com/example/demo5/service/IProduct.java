package com.example.demo5.service;

import com.example.demo5.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct{
    public void add(Product product) throws SQLException;

    public Product findById(int id);

    public List<Product> findAll();

    public List<Product> findByName(String name);

    public List<Product> findAllOrderByAge();

    public boolean delete(int id) throws SQLException;

    public boolean update(Product product) throws SQLException;
}
