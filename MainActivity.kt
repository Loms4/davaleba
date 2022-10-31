package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R

private val View.text: Any
    get() {

    }

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textView4)
    }



    fun View.numberClick() {
        if (this is TextView){
            val text = resultTextView.text.toString()
            val number = this.text.toString()


            val result = text + number

            resultTextView.text = result
        }
    }

    fun numberClick(clickedView: View) {

        var text= resultTextView.text.tostring()
        val number = clickedView.text.toString()

        if (text == "0"){
            text = ""
        }
        val result = text +number
        resultTextView.text =result

    }

}

private fun CharSequence.tostring(): Any {

}

fun operationClick(clickeddView: View){
    if(clickedView is TextView) {
        var operand = resultTextView.text.tostring().toDouble()
        operation = clickedView.text.tostring()

        resultTextView.text = ""
    }
}
fun operationClick(clickeddView: View){
    val secOperand = resultTextView.text.tostring().toDouble()
    when (operation) {
        "+" ->resultTextView.text = (operand + secOperand).toString()
        "*" ->resultTextView.text = (operand * secOperand).toString()
        "-" ->resultTextView.text = (operand - secOperand).toString()
        "/" ->resultTextView.text = (operand / secOperand).toString()
    }
}
