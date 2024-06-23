package com.example.Ecommerce.dto;

import com.example.Ecommerce.model.Category;
import com.example.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category category);
}

