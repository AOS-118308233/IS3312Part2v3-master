/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.DAO;

import com.shop.model.Product;
import com.shop.utils.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aoife
 */
public class ProductDAO {
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Product> getTopProducts(int numProducts){
        
       DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        
        String productCode;
        String productName;
        String productDescription;
        String brandName;
        String price;
        String colour;
        String animalType;
        String productImage;
        
        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int productCount = 0;
            while (rs.next()) {
                if (productCount >= numProducts)
                    break;
                productCode = (rs.getString(1));
                productName = (rs.getString(2));
                productDescription = (rs.getString(3));
                brandName = (rs.getString(4));
                price = (rs.getString(5));
                colour = (rs.getString(6));
                animalType = (rs.getString(7));
                productImage = (rs.getString(8));
                
                Product product = new Product();
                product.setProductCode(productCode);
                product.setProductName(productName);
                product.setProductDescription(productDescription);
                product.setBrandName(brandName);
                product.setPrice(price);
                product.setColour(colour);
                product.setAnimalType(animalType);
                product.setProductImage(productImage);
                productData.add(product);
                productCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;
        
         
        
    }
    
}