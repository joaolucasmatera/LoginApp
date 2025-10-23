package com.example.loginapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import kotlin.random.nextInt

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)


            val username = intent.getStringExtra("username")
            val welcomeText = findViewById<TextView>(R.id.welcomeText)
            welcomeText.text = "Bem-vindo, $username!"

            val nameInTable = findViewById<TextView>(R.id.nameTable)
            nameInTable.text = "$username"

            val mockupId = findViewById<TextView>(R.id.idFalso)
            val randomNumber = Random.nextInt(100000)
            mockupId.text = randomNumber.toString();



            insets
        }



    }
}