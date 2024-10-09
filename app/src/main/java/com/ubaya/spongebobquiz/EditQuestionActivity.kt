package com.ubaya.spongebobquiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.spongebobquiz.databinding.ActivityNewQuestionBinding

class EditQuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}