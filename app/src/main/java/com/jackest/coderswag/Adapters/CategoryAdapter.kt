package com.jackest.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.jackest.coderswag.Model.Category
import com.jackest.coderswag.R

class CategoryAdapter( context: Context, categories: List<Category>):BaseAdapter(){

    val context =context
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView :View
        val holder :ViewHolder
        if (convertView == null) {
            //layoutinflater: its an object take xml to code
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById((R.id.categoryImage))
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            //any values to categoryview goes to the holder
            categoryView.tag = holder
        }else{
            holder  =convertView.tag as ViewHolder
            categoryView = convertView
            println("go green")
        }



        //set category to the list of view
        val category = categories[position]
        //convert name to resource id
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0 //find the unique id
    }

    override fun getCount(): Int {
        return categories.count()
    }

     private class ViewHolder{
         var  categoryImage: ImageView? = null
         var categoryName : TextView? = null
     }
}