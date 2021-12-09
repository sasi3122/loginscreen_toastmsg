package com.example.manikandan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
      val  editName: AppCompatEditText = findViewById(R.id.user_id);
//         get reference to button
        var btn_click_me = findViewById(R.id.submit1) as Button
// set on-click listener
        btn_click_me.setOnClickListener() {
            val text = editName.text;
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}