package com.jackest.coderswag.Services

import com.jackest.coderswag.Model.Category
import com.jackest.coderswag.Model.Product

object DataServices {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoods image")
    )
    val hats = listOf(
        Product("Graphic Beanie", "$18", "hats01"),
        Product("Hat Black","$28","hat02"),
        Product("Hat White","$20","hat02"),
        Product("Hat Snapback", "$22", "hat04")
    )
    val hoodies = listOf(
        Product("Hoodie Gray","$28","hoodie01"),
        Product("Hoodie Red","32","hoodie02"),
        Product("Gray Hoodie","$28", "hoodie03"),
        Product("Black Hoodie", "$32", "hoodie04")
    )
    val shirts = listOf(
        Product("Shirt Black","$18", "shirt01"),
        Product("Badge Light Gray","$20","shirt02"),
        Product("Logo Shirt Red","$22","shirt03"),
        Product("Hustle","$22","shirt04"),
        Product("Kickfli[ Studios","$18","shirt05")
    )
}