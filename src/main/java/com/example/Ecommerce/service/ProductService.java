package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.ProductRepository;
import com.example.Ecommerce.model.Category;
import com.example.Ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    public List<Product> getProductsByCategory(Category category) {
        return productRepository.findByCategory(category);
    }
}

