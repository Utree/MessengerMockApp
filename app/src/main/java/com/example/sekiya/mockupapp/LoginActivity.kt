package com.example.sekiya.mockupapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log // Logの表示
import kotlinx.android.synthetic.main.activity_login.* // acitivityとつなぐ

// Login画面用Activity
class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // ログインボタンのアクション
        login_button_login.setOnClickListener {
            // textを表示
            Log.d("LoginActivity", "ID: " + id_edittext_login.text.toString())
            Log.d("LoginActivity", "Password: " + password_edittext_login.text.toString())

            // ChatlistActivityを表示
            val chatlistIntent = Intent(this, ChatlistActivity::class.java)
            startActivity(chatlistIntent)
        }

        // 登録画面遷移用のアクション
        regist_account_textview.setOnClickListener {
            // textを表示
            Log.d("MainActivity", "Try to show register activity")

            // LoginActivityに戻る
            finish()
        }
    }
}