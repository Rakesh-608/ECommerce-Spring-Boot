package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.CustomerOrder;
import com.example.Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder customerOrder) {
        CustomerOrder createdCustomerOrder = orderService.createOrder(customerOrder);
        return ResponseEntity.ok(createdCustomerOrder);
    }

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> getAllOrders() {
        List<CustomerOrder> customerOrders = orderService.getAllOrders();
        return ResponseEntity.ok(customerOrders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getOrderById(@PathVariable Long id) {
        CustomerOrder customerOrder = orderService.getOrderById(id);
        return ResponseEntity.ok(customerOrder);
    }
}

