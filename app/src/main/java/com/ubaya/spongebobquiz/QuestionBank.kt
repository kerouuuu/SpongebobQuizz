package com.ubaya.spongebobquiz

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuestionBank(
    var question: String,
    var answer: Boolean,
    var imageId: Int,
    var imageURL: String = "",
    var isAvailabel: Boolean = true
) : Parcelable