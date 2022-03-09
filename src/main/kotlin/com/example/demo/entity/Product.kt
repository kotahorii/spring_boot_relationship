package com.example.demo.entity

import javax.persistence.*

@Entity
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val productName: String,
    val qty: Int,
    val price: Int,
    @ManyToOne
    val customer: Customer
)