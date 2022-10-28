package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var string=String()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get button using the id
        val button01 = findViewById<Button>(R.id.button)
        button01.setOnClickListener {
            gameBtnClick(button01)
        }

        val button02 = findViewById<Button>(R.id.button2)
        button02.setOnClickListener {
            gameBtnClick(button02)
        }

        val button03 = findViewById<Button>(R.id.button3)
        button03.setOnClickListener {
            gameBtnClick(button03)
        }

        val button04 = findViewById<Button>(R.id.button4)
        button04.setOnClickListener {
            gameBtnClick(button04)
        }

        val button05 = findViewById<Button>(R.id.button6)
        button05.setOnClickListener {
            gameBtnClick(button05)
        }

        val button06 = findViewById<Button>(R.id.button7)
        button06.setOnClickListener {
            gameBtnClick(button06)
        }

        val button07 = findViewById<Button>(R.id.button5)
        button07.setOnClickListener {
            gameBtnClick(button07)
        }

        val button08 = findViewById<Button>(R.id.button8)
        button08.setOnClickListener {
            gameBtnClick(button08)
        }

        val button09 = findViewById<Button>(R.id.button9)
        button09.setOnClickListener {
            gameBtnClick(button09)
        }

        // send all gameplay buttons to get cleared
        val newGameButton = findViewById<Button>(R.id.button10)
        newGameButton.setOnClickListener {
            newGame(button01)
            newGame(button02)
            newGame(button03)
            newGame(button04)
            newGame(button05)
            newGame(button06)
            newGame(button07)
            newGame(button08)
            newGame(button09)
        }
    }

    private fun newGame(newGameButton: Button?) {
        val first = findViewById<TextView>(R.id.textView10)
        // resets player X to first player
        first.text = "Player X's Turn"

        // reset all X/O buttons to empty string
        string=String()
        newGameButton?.text = string
        // make all buttons clickable again
        newGameButton?.isClickable = true
    }

    private fun gameBtnClick(button: Button?) {
        val first=findViewById<TextView>(R.id.textView10)

        // determine what player clicked
        // then add the correct symbol. X or O
        if (first.text == "Player X's Turn") {
            string = "X"
        }
        else {
            string = "O"
        }

        button?.text = string

        // make selected button un-clickable
        button?.isClickable = false

        // change player
        if (first.text == "Player X's Turn") {
            first.text = "Player O's Turn"
        }
        else {
            first.text = "Player X's Turn"
        }
    }
}