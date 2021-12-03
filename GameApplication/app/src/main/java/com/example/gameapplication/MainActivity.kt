package com.example.gameapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.google.android.material.textfield.TextInputLayout
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = 789
        val guessDigit=findViewById<TextInputLayout>(R.id.digitGuess)
        val clickRight=findViewById<TextView>(R.id.clickAnswer)
        val displayAnswer=findViewById<TextView>(R.id.displayMessage)

        clickRight.setOnClickListener {
            val userName=guessDigit.editText?.text?.toString()
            val userGuess = Integer.parseInt(userName);
            val answer=
                  if(userGuess > number)"No;) My Number is Greater"
                else if(userGuess<number)"No;) My Number is Smaller "
                else "you are right!"
            displayAnswer.text = "$answer"


        }
    }
}