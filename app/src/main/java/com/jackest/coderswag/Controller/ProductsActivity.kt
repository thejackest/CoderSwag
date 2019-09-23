package com.jackest.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        //check the orientation
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        //check the screen size
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        //very important to create a layout manager
        val layoutManager = GridLayoutManager(this, spanCount)//the second one is relative to the orientation
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
