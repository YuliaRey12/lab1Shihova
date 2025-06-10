package com.example.lab1shihova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput = findViewById<EditText>(R.id.ageInput)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            resultText.text = when {
                age == null -> "Введите корректный возраст"
                age <= 20 -> "Вы слишком молоды!"
                age == 30 || age == 40 || age == 50 || age == 60 -> "Поздравляем с повышением!"
                age == 65 -> "Преподносим вам золотые часы!"
                age > 65 -> "Вы слишком стары!"
                else -> "Продолжайте накапливать опыт!"
            }
        }
    }
}