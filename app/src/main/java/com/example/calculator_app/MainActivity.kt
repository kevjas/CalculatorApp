package com.example.calculator_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Value 1 input
    var editText: EditText? = null
    //Value 2 input
    var editText2: EditText? = null
    //Result display
    var textView: TextView? = null

    lateinit var btnAdd : Button //Addition
    lateinit var btnSub : Button //Subtraction
    lateinit var btnDiv : Button //Divide

    lateinit var btnMul : Button //Multiplication
    lateinit var btnSqR : Button //Square Root
    lateinit var btnPro : Button //Procentage

    lateinit var btnPyt : Button //Pythagorean theorem
    lateinit var btnCir : Button //Circle Area
    lateinit var btnCyl : Button //Cylinder Volume

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<View>(R.id.editText1) as EditText
        editText2 = findViewById<View>(R.id.editText2) as EditText
        textView = findViewById<View>(R.id.textView) as TextView

        btnAdd = findViewById(R.id.btAdd)
        btnSub = findViewById(R.id.btSub)
        btnDiv = findViewById(R.id.btDiv)
        btnMul = findViewById(R.id.btMul)
        btnSqR = findViewById(R.id.btSqR)
        btnPro = findViewById(R.id.btPro)
        btnPyt = findViewById(R.id.btPyt)
        btnCir = findViewById(R.id.btCir)
        btnCyl = findViewById(R.id.btCyl)

        btnAdd.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal1 + tal2
            textView!!.text = "$result"
        }

        btnSub.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal1 - tal2
            textView!!.text = "$result"
        }

        btnDiv.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()

            if (tal2 != 0.0) {
                val result = tal1 / tal2
                textView!!.text = "$result"
            } else {
                Toast.makeText(this@MainActivity, "Cannot divide by zero", Toast.LENGTH_LONG).show()
            }
        }

        btnMul.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal1 * tal2
            textView!!.text = "$result"
        }

        btnSqR.setOnClickListener {
            val s1 = editText!!.text.toString()
            val tal1 = s1.toDouble()
            val result = Math.sqrt(tal1)
            textView!!.text = "$result"
        }

        btnPro.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal1 * tal2 / 100
            textView!!.text = "$result"
        }

        btnPyt.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal1 * tal1 + tal2 * tal2
            textView!!.text = "$result"
        }

        btnCir.setOnClickListener {
            val s1 = editText!!.text.toString()
            val tal1 = s1.toDouble()
            val result = tal1 * tal1 * 3.14
            textView!!.text = "$result"
        }

        btnCyl.setOnClickListener {
            val s1 = editText!!.text.toString()
            val s2 = editText2!!.text.toString()
            val tal1 = s1.toDouble()
            val tal2 = s2.toDouble()
            val result = tal2 * 3.14 * (tal1 * tal1)
            textView!!.text = "$result"
        }
    }
}
