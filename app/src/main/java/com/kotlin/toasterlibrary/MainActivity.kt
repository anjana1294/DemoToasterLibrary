package com.kotlin.toasterlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var onClick=findViewById(R.id.button) as Button
        onClick.setOnClickListener {
            Toast.makeText(this,"hello,this toast message !",Toast.LENGTH_LONG)
        }
    }
}
