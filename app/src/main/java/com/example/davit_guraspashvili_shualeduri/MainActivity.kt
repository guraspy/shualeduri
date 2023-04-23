package com.example.davit_guraspashvili_shualeduri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTextEmailAddress : EditText
    private lateinit var textView3 : EditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        editTextTextEmailAddress = findViewById(R.editTextTextEmailAddress.text)
//        textView3 = findViewById(R.textView3.text)
//        button = findViewById(R.button.text)

        intent = Intent(this,MainActivity2::class.java)

        if (editTextTextEmailAddress.text.isNotEmpty()){
            if (textView3.text.isNotEmpty()){
                if (editTextTextEmailAddress.text.contains("@")){
                    if (textView3.length()<250){

//                        setOnClickListener
//                            putExtra
//                            startActivity(intent)

                    }
                }
            }
        }


    }
}