package com.example.test.tuan32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.test.R

class Tuan32MainActivity : AppCompatActivity() {
    var  adap:tuan32Adapter? = null
    var ls: ArrayList<tuan32Contact> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main)
        var lv=findViewById<ListView>(R.id.tuan32lv) //anh xa
        //tao nguon du lieu
        ls.add(tuan32Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background))
        ls.add(tuan32Contact("Nguyen Van B", "20", R.drawable.ic_launcher_foreground))
        ls.add(tuan32Contact("Nguyen Van C", "19", R.drawable.ic_launcher_background))
        ls.add(tuan32Contact("Nguyen Van D", "45", R.drawable.ic_launcher_foreground))
        ls.add(tuan32Contact("Nguyen Van E", "50", R.drawable.ic_launcher_background))
        //gan vao adapter
        adap= tuan32Adapter(this,ls)
        lv.adapter=adap
    }
}