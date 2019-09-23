package com.jackest.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jackest.coderswag.R
import com.jackest.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        var categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
