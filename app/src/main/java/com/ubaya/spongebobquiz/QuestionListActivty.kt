package com.ubaya.spongebobquiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.spongebobquiz.databinding.ActivityQuestionListBinding

class QuestionListActivty : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recQuestion.layoutManager = LinearLayoutManager(this)
        binding.recQuestion.setHasFixedSize(true)
        binding.recQuestion.adapter = QuestionAdapter()

    }
    override fun onResume() {
        super.onResume()
        binding.recQuestion.layoutManager = LinearLayoutManager(this)
        binding.recQuestion.setHasFixedSize(true)
        binding.recQuestion.adapter = QuestionAdapter()
    }

}