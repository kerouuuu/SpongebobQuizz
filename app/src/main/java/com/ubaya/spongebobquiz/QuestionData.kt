package com.ubaya.spongebobquiz

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
object QuestionData : Parcelable {
    var questions: Array<QuestionBank> = arrayOf(
        QuestionBank("Krusty Krab is the favorite burger in Bikini Bottom", false, R.drawable.img_5),
        QuestionBank("Spongebob lives in a pineapple under the sea", true, R.drawable.img_3),
        QuestionBank("Karen is Plankton’s wife", true, R.drawable.img_7),
        QuestionBank("Mermaid Man was once a superhero of Bikini Bottom", true, R.drawable.img_6),
        QuestionBank("Squidward has four hands", false, R.drawable.img_4)
    )
}