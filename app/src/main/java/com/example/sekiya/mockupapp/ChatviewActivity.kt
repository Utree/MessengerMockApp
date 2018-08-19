package com.example.sekiya.mockupapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

// Login画面用Activity
class ChatviewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatview)

        // 遷移元のViewから値を取得
        val text = intent.getStringExtra("TEXT_KEY")
        // textViewに接続
        val textView = findViewById(R.id.textView) as TextView
        // 値を設定
        textView.setText(text)

    }
}