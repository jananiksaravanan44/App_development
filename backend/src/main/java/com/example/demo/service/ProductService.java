package com.example.demo.service;

import com.example.demo.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repo.*;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public ProductModel saveMessage(ProductModel productModel) {
        return pr.save(productModel);
    }

    public List<ProductModel> getAllMessages() {
        return pr.findAll();
    }

    public ProductModel getMessageById(Long id) {
        return pr.findById(id).orElse(null);
    }
}