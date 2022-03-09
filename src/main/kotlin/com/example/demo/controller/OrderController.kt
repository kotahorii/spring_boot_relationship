package com.example.demo.controller

import com.example.demo.entity.Customer
import com.example.demo.entity.Product
import com.example.demo.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(private val orderService: OrderService) {
    @PostMapping("/customer")
    fun placeOrder(@RequestBody customer: Customer): Customer {
        orderService.placeOrder(customer)
        return customer
    }

    @GetMapping("/customer")
    fun findAllOrders(): List<Customer> {
        return orderService.findAllOrders()
    }

    @GetMapping("/product")
    fun findAllProducts(): List<Product> {
        return orderService.findAllProducts()
    }
}