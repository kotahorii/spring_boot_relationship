package com.example.demo.service

import com.example.demo.entity.Customer
import com.example.demo.entity.Product
import com.example.demo.repository.CustomerRepository
import com.example.demo.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val customerRepository: CustomerRepository,
    private val productRepository: ProductRepository
) {
    fun placeOrder(customer: Customer): Customer = customerRepository.save(customer)

    fun findAllOrders(): List<Customer> = customerRepository.findAll()

    fun findAllProducts(): List<Product> = productRepository.findAll()
}