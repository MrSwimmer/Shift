package com.example.shift.feature.note.detail.presentaion

import com.example.common2.Note
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shift.R
import kotlinx.android.synthetic.main.activity_detail_note.*

class NoteDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parameters = intent.getSerializableExtra("Note") as Note?

        titleDetail.text = parameters?.title
        descriptionDetail.text = parameters?.description
    }
}