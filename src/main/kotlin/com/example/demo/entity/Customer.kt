package com.example.demo.entity

import javax.persistence.*

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val email: String,
    val gender: String,
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "customer")
    val products: MutableList<Product>?,
)
