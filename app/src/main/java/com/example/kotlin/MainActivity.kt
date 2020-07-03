package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickListener = View.OnClickListener {

            when(it.id) {
                loopBtn.id -> {
                    val intent = Intent(this, LoopActivity::class.java)
                    startActivity(intent)
                }
                controlBtn.id -> {
                    val intent = Intent(this, ControlActivity::class.java)
                    startActivity(intent)
                }
                classBtn.id -> {
                    val intent = Intent(this, ClassActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        loopBtn.setOnClickListener(btnClickListener)
        controlBtn.setOnClickListener(btnClickListener)
        classBtn.setOnClickListener(btnClickListener)
    }
}