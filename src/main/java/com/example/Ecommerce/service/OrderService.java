package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.OrderRepository;
import com.example.Ecommerce.model.CustomerOrder;
import com.example.Ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public CustomerOrder addOrder(CustomerOrder customerOrder) {
        return orderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public CustomerOrder getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id " + id));
    }

    public List<Product> getProductsByOrderId(Long orderId) {
        CustomerOrder customerOrder = getOrderById(orderId);
        return customerOrder.getProducts();
    }
}



