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
        checkForWinner()
    }

    private fun checkForWinner() {
        // current player text
        val currentPlayer = findViewById<TextView>(R.id.textView10)
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

        // check for a tie


        //check if X is a winner
        if ((button01.text == "X" && button02.text == "X" && button03.text == "X")
            || (button04.text == "X" && button05.text == "X" && button06.text == "X")
            || (button07.text == "X" && button08.text == "X" && button09.text == "X")
            || (button01.text == "X" && button04.text == "X" && button07.text == "X")
            || (button02.text == "X" && button05.text == "X" && button08.text == "X")
            || (button03.text == "X" && button06.text == "X" && button09.text == "X")
            || (button01.text == "X" && button05.text == "X" && button09.text == "X")
            || (button03.text == "X" && button05.text == "X" && button07.text == "X")) {
                currentPlayer.text = "Player X is the WINNER!!!"
                disableAllbuttons(button01)
                disableAllbuttons(button02)
                disableAllbuttons(button03)
                disableAllbuttons(button04)
                disableAllbuttons(button05)
                disableAllbuttons(button06)
                disableAllbuttons(button07)
                disableAllbuttons(button08)
                disableAllbuttons(button09)
        }

        //check if O is a winner
        if ((button01.text == "O" && button02.text == "O" && button03.text == "O")
            || (button04.text == "O" && button05.text == "O" && button06.text == "O")
            || (button07.text == "O" && button08.text == "O" && button09.text == "O")
            || (button01.text == "O" && button04.text == "O" && button07.text == "O")
            || (button02.text == "O" && button05.text == "O" && button08.text == "O")
            || (button03.text == "O" && button06.text == "O" && button09.text == "O")
            || (button01.text == "O" && button05.text == "O" && button09.text == "O")
            || (button03.text == "O" && button05.text == "O" && button07.text == "O")) {
                currentPlayer.text = "Player O is the WINNER!!!"
                disableAllbuttons(button01)
                disableAllbuttons(button02)
                disableAllbuttons(button03)
                disableAllbuttons(button04)
                disableAllbuttons(button05)
                disableAllbuttons(button06)
                disableAllbuttons(button07)
                disableAllbuttons(button08)
                disableAllbuttons(button09)
        }

        if ((button01.isClickable == false && button02.isClickable == false && button03.isClickable == false &&
            button04.isClickable == false && button05.isClickable == false && button06.isClickable == false &&
            button07.isClickable == false && button08.isClickable == false && button09.isClickable == false)
            && currentPlayer.text != "Player O is the WINNER!!!"
            && currentPlayer.text != "Player X is the WINNER!!!") {
            currentPlayer.text = "There is a Tie!!!"
        }

    }

    private fun disableAllbuttons(button: Button?) {
        button?.isClickable = false
    }

}