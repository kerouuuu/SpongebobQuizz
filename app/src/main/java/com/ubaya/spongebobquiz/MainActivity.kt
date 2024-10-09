package com.ubaya.spongebobquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.spongebobquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val playerName = intent.getStringExtra(IntroActivity.PLAYER_NAME)
        binding.txtWelcome.text = "Welcome, " + playerName + "!"

        val txtQuestion = findViewById<TextView>(R.id.txtQuestion)
        val btn = findViewById<Button>(R.id.btnTrue)
        btn.setOnClickListener {
            txtQuestion.text = "Spongebob Quiz"
        }

        binding.btnTrue.setOnClickListener {
            val intent = Intent(this, NewQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}