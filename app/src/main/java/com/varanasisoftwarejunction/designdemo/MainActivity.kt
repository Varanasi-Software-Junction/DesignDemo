package com.varanasisoftwarejunction.designdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b:Button =findViewById<Button>(R.id.button)
        b.setOnClickListener(View.OnClickListener {
            try {
                doAdd()
            } catch (ex: Exception) {
                val text: String = "" + ex.message
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }
            )
        }


    fun doAdd()
    {

val n1 =("" + findViewById<EditText>(R.id.edN1).text).toInt()
        val n2 =("" + findViewById<EditText>(R.id.tvN1).text).toInt()

        val sum:String ="" + (n1+n2).toString()
        findViewById<TextView>(R.id.textView).text=sum
    }
    fun toNextActivity()
    {
        val intent = Intent(applicationContext, NextActivity::class.java)

                intent.putExtra("data", "I am Data")
                startActivity(intent)
            }
    }
