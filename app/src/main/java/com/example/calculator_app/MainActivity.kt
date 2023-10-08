package com.example.calculator_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit

    //Value 1 input
    lateinit var editText1: TextInputEditText

    //Value 2 input
    lateinit var editText2: TextInputEditText

    //Result display
    lateinit var resultTv: TextView

    val btnAdd: Button by lazy { findViewById(R.id.btAdd) }
    val btnSub: Button by lazy { findViewById(R.id.btSub) }
    val btnDiv: Button by lazy { findViewById(R.id.btDiv) }
    val btnMul: Button by lazy { findViewById(R.id.btMul) }
    val btnSqR: Button by lazy { findViewById(R.id.btSqR) }
    val btnPro: Button by lazy { findViewById(R.id.btPro) }
    val btnPyt: Button by lazy { findViewById(R.id.btPyt) }
    val btnCir: Button by lazy { findViewById(R.id.btCir) }
    val btnCyl: Button by lazy { findViewById(R.id.btCyl) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        resultTv = findViewById(R.id.textView)

        /*





                     btnMul.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val s2 = editTex2!!.text.toString()
                         val tal1 = s1.toDouble()
                         val tal2 = s2.toDouble()
                         val result = tal1 * tal2
                         resultTv!!.text = "$result"
                     }

                     btnSqR.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val tal1 = s1.toDouble()
                         val result = sqrt(tal1)
                         resultTv!!.text = "$result"
                     }

                     btnPro.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val s2 = editTex2!!.text.toString()
                         val tal1 = s1.toDouble()
                         val tal2 = s2.toDouble()
                         val result = tal1 * tal2 / 100
                         resultTv!!.text = "$result"
                     }

                     btnPyt.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val s2 = editTex2!!.text.toString()
                         val tal1 = s1.toDouble()
                         val tal2 = s2.toDouble()
                         val result = tal1 * tal1 + tal2 * tal2
                         resultTv!!.text = "$result"
                     }

                     btnCir.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val tal1 = s1.toDouble()
                         val result = tal1 * tal1 * 3.14
                         resultTv!!.text = "$result"                     }

                     btnCyl.setOnClickListener
                     {
                         val s1 = editText!!.text.toString()
                         val s2 = editTex2!!.text.toString()
                         val tal1 = s1.toDouble()
                         val tal2 = s2.toDouble()
                         val result = tal2 * 3.14 * (tal1 * tal1)
                         resultTv!!.text = "$result"
         */

    }}

