package com.ubaya.spongebobquiz

data class QuestionBank(
    var question: String,
    var answer: Boolean,
    var imageId: Int,
    var imageURL: String = "",
    var isAvailabel: Boolean = true
)