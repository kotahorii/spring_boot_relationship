package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Product(
    @Id
    val pid: Int,
    val productName: String,
    val qty: Int,
    val price: Int,
)