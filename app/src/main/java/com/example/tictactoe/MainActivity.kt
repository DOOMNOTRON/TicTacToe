package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = findViewById<TextView>(R.id.textView10)

        // get button using the id
        val button01 = findViewById<Button>(R.id.button)

        val button02 = findViewById<Button>(R.id.button2)

        val button03 = findViewById<Button>(R.id.button3)

        val button04 = findViewById<Button>(R.id.button4)

        val button05 = findViewById<Button>(R.id.button6)

        val button06 = findViewById<Button>(R.id.button7)

        val button07 = findViewById<Button>(R.id.button5)

        val button08 = findViewById<Button>(R.id.button8)

        val button09 = findViewById<Button>(R.id.button9)


        fun NewGame() {
            // resets player X to first player
            first.text = "Player X's Turn"

            // reset all X/O buttons to blank

            // make all buttons clickable again
        }

        fun gameBtnClick() {
            // determine what player clicked

            // add the correct symbol. X or O

            // make selected button un clickable

            // change player
            if (first.text == "Player X's Turn") {
                first.text = "Player O's Turn"
            }
            else {
                first.text == "Player X's Turn"
            }
        }
    }
}