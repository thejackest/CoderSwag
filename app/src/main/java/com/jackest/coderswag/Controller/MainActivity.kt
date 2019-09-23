package com.jackest.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jackest.coderswag.Adapters.CategoryAdapter
import com.jackest.coderswag.Adapters.CategoryRecycleAdapter
import com.jackest.coderswag.Model.Category
import com.jackest.coderswag.R
import com.jackest.coderswag.Services.DataServices
import com.jackest.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter :CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataServices.categories){
            category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)

            startActivity(productIntent)
            //println(category.title)
        }//CategoryRecycleAdapter(this, DataServices.categories)
        categoryListView.adapter = adapter

        /*categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataServices.categories[position]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT)
        }*/
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }
}
