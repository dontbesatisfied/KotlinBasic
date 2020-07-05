package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_control.*

class ControlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        val btnOnClickListener = View.OnClickListener {
            when (it.id) {
                androidBtn.id -> {
                    imageView.setImageResource(R.drawable.android)
                }
                iosBtn.id -> {
                    imageView.setImageResource(R.drawable.ios)
                }
            }
        }

        androidBtn.setOnClickListener(btnOnClickListener)
        iosBtn.setOnClickListener(btnOnClickListener)

    }
}