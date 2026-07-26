package com.myapp.hello

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Hello World 123"
            textSize = 24f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
        }

        setContentView(textView)
    }
}
