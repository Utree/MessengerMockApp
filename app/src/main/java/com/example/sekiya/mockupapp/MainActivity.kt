package com.example.sekiya.mockupapp

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.content.Intent
import android.support.v7.app.AppCompatActivity

// Register画面用のActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 登録ボタンのアクション
        regist_button_register.setOnClickListener {
            // textを表示
            Log.d("MainActivity", "Name: " + id_edittext_register.text.toString())
            Log.d("MainActivity", "ID: " + id_edittext_register.text.toString())
            Log.d("MainActivity", "Password: " + password_edittext_register.text.toString())

            // ChatlistActivityを表示
            val chatlistIntent = Intent(this, ChatlistActivity::class.java)
            startActivity(chatlistIntent)
        }

        // ログイン遷移用のアクション
        already_have_account_textview.setOnClickListener {
            // textを表示
            Log.d("MainActivity", "Try to show login activity")

            // LoginActivityを表示
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }
    }
}
