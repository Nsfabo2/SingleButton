package com.example.singlebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var ET: EditText
    lateinit var Btn: Button
    lateinit var TV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ET = findViewById(R.id.ET)
        Btn = findViewById(R.id.Btn)
        TV = findViewById(R.id.TV)

        Btn.setOnClickListener {
            TV.text = ET.text
        }

    }//end oncreate
}