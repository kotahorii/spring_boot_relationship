package com.example.demo.entity

import javax.persistence.*

@Entity
@Table(name = "customers")
data class Customer(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String,
    val email: String,
    val gender: String,
    @OneToMany(cascade = [CascadeType.ALL])
    val products: List<Product>? = null,
)
