package com.ubaya.spongebobquiz

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.spongebobquiz.databinding.ActivityNewQuestionBinding

@Suppress("DEPRECATION")
class EditQuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data: QuestionBank? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("data", QuestionBank::class.java)
        } else {
            intent.getParcelableExtra("data")
        }

        data?.let {
            binding.textView13.text = it.question

            when(it.answer) {
                true -> binding.trueOption.isChecked = true
                else -> binding.falseOption.isChecked = true
            }
        }
    }
}