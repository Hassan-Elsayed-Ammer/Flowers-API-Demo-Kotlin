package com.codestation.flowers_api_demo_kotlin.model

data class Flower(
    private var category: String,
    private var price: Double,
    private var instructions: String,
    private var photo: String,
    private var name: String,
    private var productId: Int
) {
}