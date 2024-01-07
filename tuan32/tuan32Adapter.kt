package com.example.test.tuan32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.test.R

class tuan32Adapter(context: Context, ls:ArrayList<tuan32Contact>):BaseAdapter() {
    var ls:ArrayList<tuan32Contact> =ls
    var context: Context = context

    //lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }

    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //tao view
    //gan du lieu
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1. tao view
        //1.1 neu chua co view -> tao view moi
        var vax: ViewAX
        if (convertView==null){
            vax = ViewAX() //tao view moi
            //anh xa layout
            c=LayoutInflater.from(context).inflate(R.layout.tuan32_item_view,null)
            //anh xa tung thanh phan cua layout
            vax.img_hinh = c.findViewById(R.id.tuan32ItemHinh)
            vax.tv_ten = c.findViewById(R.id.tuan32ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.tuan32ItemTuoi)
            //tao template de lan sau su dung
            c.tag = vax
        }
        //1.2 neu da co view -> su dung view cu
        else{
            vax = c!!.tag as ViewAX
        }
        //2.gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        vax.tv_ten!!.text=ls[position].ten!!
        return c!!

    }
    //khai bao lop anh xa ItemView
    inner class ViewAX{
        var img_hinh: ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }
}