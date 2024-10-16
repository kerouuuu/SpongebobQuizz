package com.ubaya.spongebobquiz

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.spongebobquiz.databinding.QuestionCardBinding

class QuestionAdapter():RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {
    class QuestionViewHolder(val binding:QuestionCardBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = QuestionCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)

    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.binding.imgQuestion1.setImageResource(QuestionData.questions[position].imageId)
        holder.binding.txtQuestionTitle1.text = QuestionData.questions[position].question
        holder.binding.btnEdit1.setOnClickListener {
            val intent = Intent(holder.itemView.context, EditQuestionActivity::class.java)
            intent.putExtra("question_index", position)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return QuestionData.questions.size
    }


}
