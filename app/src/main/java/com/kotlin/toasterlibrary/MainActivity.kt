package com.kotlin.toasterlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.kotlin.anjanalibrary.ShowToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val onClick=findViewById(R.id.button) as Button
        onClick.setOnClickListener {
            Toast.makeText(this,"hello,this toast message !",Toast.LENGTH_LONG);
            ShowToast.show(this,"My library toast");
        }
    }
}
