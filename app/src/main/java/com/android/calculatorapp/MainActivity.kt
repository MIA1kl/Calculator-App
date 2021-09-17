package com.android.calculatorapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    var result = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addBtn : Button = findViewById(R.id.addBtn)
        addBtn.setOnClickListener{
            val a = findViewById<View>(R.id.num1) as EditText
            val b = findViewById<View>(R.id.num2) as EditText
            var num1 = a.text.toString().toInt().toDouble()
            var num2 = b.text.toString().toInt().toDouble()
            result = num1 + num2
            openActivity2(result)
        }
        val mulBtn : Button = findViewById(R.id.mulBtn)
        mulBtn.setOnClickListener{
            val a = findViewById<View>(R.id.num1) as EditText
            val b = findViewById<View>(R.id.num2) as EditText
            var num1 = a.text.toString().toInt().toDouble()
            var num2 = b.text.toString().toInt().toDouble()
            result = num1 * num2
            openActivity2(result)
        }

        val divBtn : Button = findViewById(R.id.divBtn)
        divBtn.setOnClickListener{
            val a = findViewById<View>(R.id.num1) as EditText
            val b = findViewById<View>(R.id.num2) as EditText
            var num1 = a.text.toString().toInt().toDouble()
            var num2 = b.text.toString().toInt().toDouble()
            result = num1 / num2
            openActivity2(result)
        }

        val subBtn : Button = findViewById(R.id.subBtn)
        subBtn.setOnClickListener{
            val a = findViewById<View>(R.id.num1) as EditText
            val b = findViewById<View>(R.id.num2) as EditText
            var num1 = a.text.toString().toInt().toDouble()
            var num2 = b.text.toString().toInt().toDouble()
            result = num1 - num2
            openActivity2(result)
        }
    }

    fun openActivity2(result: Double?) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("key", java.lang.Double.toString(result!!))
        startActivity(intent)
    }
}