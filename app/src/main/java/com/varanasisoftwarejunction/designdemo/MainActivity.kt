package com.varanasisoftwarejunction.designdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b:Button =findViewById<Button>(R.id.button)
        b.setOnClickListener(View.OnClickListener {
            val text:String="I was clicked"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show() })
    }
    fun doAdd()
    {

    }
    fun toNextActivity()
    {
        val intent = Intent(applicationContext, NextActivity::class.java)

                intent.putExtra("data", "I am Data")
                startActivity(intent)
            }
    }
