package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.OrderRepository;
import com.example.Ecommerce.model.CustomerOrder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        // Assuming order object has been populated with products and other details
        return orderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public CustomerOrder getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order not found with id " + id));
    }
}


