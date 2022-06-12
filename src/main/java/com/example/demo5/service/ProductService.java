package com.example.demo5.service;

import com.example.demo5.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProduct{
    private String jdbcUrl="jdbc:mysql://localhost:3306/qly";
    private String username="root";
    private String password="123456";
    private static final String GET_CUSTOMER_ALL="SELECT * FROM product";

    private static final String GET_CUSTOMER_GETBYID="SELECT * FROM product WHERE id=?";
    private static final String UPDATE_CUSTOMER="UPDATE product SET name=?,rootpice=?,discount=? where id=?; ";
    private static final String DELETE_CUSTOMER="DELETE FROM product WHERE Id=?";
    private Connection getConnection()
    {
        Connection connection=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void add(Product product) throws SQLException {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productlist = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_CUSTOMER_ALL);

            //add dependenci
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"),rs.getString("name"), rs.getInt("price"),rs.getString("image"));
                productlist.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productlist;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public List<Product> findAllOrderByAge() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return false;
    }
}
