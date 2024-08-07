package com.example.demo.controller;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/submit")
    public ProductModel submitMessage(@RequestBody ProductModel productModel) {
        return productService.saveMessage(productModel);
    }

    @GetMapping("/items")
    public List<ProductModel> getAllMessages() {
        return productService.getAllMessages();
    }

    @GetMapping("/items/{id}")
    public ProductModel getMessageById(@PathVariable Long id) {
        return productService.getMessageById(id);
    }
}