/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.service;

import java.util.ArrayList;
import com.shop.DAO.ProductDAO;
import com.shop.model.Product;

/**
 *
 * @author aoife
 */

public class ProductManager {
    
     public ArrayList<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getTopProducts(12);
        
    }
    
}
