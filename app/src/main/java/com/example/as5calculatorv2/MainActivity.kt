package com.example.as5calculatorV2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button2.setOnClickListener {
            text1.setText("0")
        }
        button7.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "7")
            } else {
                text1.setText( text1.text.toString() + "7")
            }
        }
        button9.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "8")
            } else {
                text1.setText( text1.text.toString() + "8")
            }
        }
        button8.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "9")
            } else {
                text1.setText( text1.text.toString() + "9")
            }
        }
        button11.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "4")
            } else {
                text1.setText( text1.text.toString() + "4")
            }
        }
        button12.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "5")
            } else {
                text1.setText( text1.text.toString() + "5")
            }
        }
        button13.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "6")
            } else {
                text1.setText( text1.text.toString() + "6")
            }
        }
        button18.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "1")
            } else {
                text1.setText( text1.text.toString() + "1")
            }
        }
        button19.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "2")
            } else {
                text1.setText( text1.text.toString() + "2")
            }
        }
        button20.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("")
                text1.setText( text1.text.toString() + "3")
            } else {
                text1.setText( text1.text.toString() + "3")
            }
        }
        button15.setOnClickListener {
            if ( text1.text == "0") {
                text1.setText("0")
            } else {
                text1.setText( text1.text.toString() + "0")
            }
        }

    }
}
