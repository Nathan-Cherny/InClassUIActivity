package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>): BaseAdapter() {

    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val number = numbers[position]
        val textView = if(convertView == null){
            TextView(context)
        }
        else{
            (convertView as TextView)
        }

        textView.text = number.toString()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val number = numbers[position]
        val textView = if(convertView == null){
            TextView(context)
        }
        else{
            (convertView as TextView)
        }

        textView.text = number.toString()
        textView.textSize = number.toFloat()
        return textView
    }

}