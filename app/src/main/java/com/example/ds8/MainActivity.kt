package com.example.ds8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name:EditText = findViewById(R.id.name)
        val send:Button = findViewById(R.id.send)
        send.setOnClickListener{
            val fragment = Other()
            val x = name.text.toString()
            val bundle = Bundle()
            bundle.putString("name",x)
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.frameLayout,fragment).commit()
        }
    }
}