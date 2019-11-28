package com.elsieashworth.cookieclicker

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var currentScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("12345", "onCreate")
        setContentView(R.layout.activity_main)

        val imgDog: ImageView = findViewById(R.id.imgJumperDog)
        val lblTotal: TextView = findViewById(R.id.lblTotal)

        imgDog.setOnClickListener {
            currentScore ++
            if (currentScore >= 10) {
                imgDog.setImageDrawable(getMyImageDrawable())
            }
            lblTotal.text = currentScore.toString()
        }
    }

    private fun getMyImageDrawable(): Drawable {
        return if (android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.LOLLIPOP) {
            resources.getDrawable(R.drawable.beans) //   imgDog.drawable = resources.getDrawable(R.drawable.beans)
        } else {
            resources.getDrawable(R.drawable.beans)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("12345", "onStart")
    }
}
