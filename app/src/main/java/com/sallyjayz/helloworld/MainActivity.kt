package com.sallyjayz.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var numberCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countOfNumber:TextView = findViewById(R.id.countOfNumber)
        countOfNumber.text = numberCount.toString()
        Log.d("onCreate", "onCreate: $numberCount")

        val decrementButton:Button = findViewById(R.id.decrementButton)
        val incrementButton:Button = findViewById(R.id.incrementButton)


        decrementButton.setOnClickListener {
            numberCount--
            countOfNumber.text = numberCount.toString()
            Log.d("decrement clicked", "onCreate: $numberCount")
        }

        incrementButton.setOnClickListener{
            numberCount++
            countOfNumber.text = numberCount.toString()
            Log.d("increment clicked", "onCreate: $numberCount")
        }
    }

}