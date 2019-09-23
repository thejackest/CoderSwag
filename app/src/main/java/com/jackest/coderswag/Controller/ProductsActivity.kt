package com.jackest.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.jackest.coderswag.Adapters.ProductsAdapter
import com.jackest.coderswag.R
import com.jackest.coderswag.Services.DataServices
import com.jackest.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter :ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        var categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //println(categoryType)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType))

        //very important to create a layout manager
        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
