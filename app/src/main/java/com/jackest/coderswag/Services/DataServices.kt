package com.jackest.coderswag.Services

import com.jackest.coderswag.Model.Category
import com.jackest.coderswag.Model.Product
//singleton
object DataServices {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),

        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),

        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black","$28","hat2"),
        Product("Hat White","$20","hat2"),
        Product("Hat Snapback", "$22", "hat4")
    )
    val hoodies = listOf(
        Product("Hoodie Gray","$28","hoodie1"),
        Product("Hoodie Red","32","hoodie2"),
        Product("Gray Hoodie","$28", "hoodie3"),
        Product("Black Hoodie", "$32", "hoodie4")
    )
    val shirts = listOf(
        Product("Shirt Black","$18", "shirt1"),
        Product("Badge Light Gray","$20","shirt2"),
        Product("Logo Shirt Red","$22","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
    )
    //empty list of type of product
    val digitalGood = listOf<Product>()

    //it will return the product based on the input string
    fun getProducts(category: String): List<Product>{
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
        //method2
//        when (category){
//            "SHIRTS" -> return shirts
//            "HATS" -> return hats
//            "HOODIES" -> return hoodies
//            else -> return digitalGood
//        }
        //method3
//        if (category == "HATS"){
//            return hats
//        }else if (category == "SHIRTS"){
//            return shirts
//        }
    }
}