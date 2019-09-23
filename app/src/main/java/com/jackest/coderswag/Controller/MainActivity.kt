package com.jackest.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.jackest.coderswag.Adapters.CategoryAdapter
import com.jackest.coderswag.Model.Category
import com.jackest.coderswag.R
import com.jackest.coderswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter :CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataServices.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataServices.categories[position]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT)
        }
    }
}
