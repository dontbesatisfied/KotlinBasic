package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loop.*
import kotlin.concurrent.thread

class LoopActivity : AppCompatActivity() {

    private var isDescendingMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)

        toggleBtn.setOnCheckedChangeListener { compoundButton, b ->
            isDescendingMode = b
        }

        startBtn.setOnClickListener {
            start()
        }
    }

    private fun start() {
        val start = Integer.parseInt(editText.text.toString())
        textView.text = editText.text

        if (isDescendingMode) {
            thread {
                for (i in start downTo 1) {
                    Thread.sleep(1000)
                    runOnUiThread {
                        textView.text = i.toString()
                    }
                }
            }
        } else {
            thread {
                for (i in 1..start) {
                    Thread.sleep(1000)
                    runOnUiThread {
                        textView.text = i.toString()
                    }
                }
            }

        }

    }
}