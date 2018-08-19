package com.example.sekiya.mockupapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chatlist.*

import android.support.v7.app.AlertDialog


class ChatlistActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatlist)
        // ListViewに表示するリスト項目をArrayListで準備する
        val data: Array<String> = arrayOf("aaa", "bbb", "ccc", "ccc", "ccc", "ccc", "ccc", "ccc")

        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        // ListViewにArrayAdapterを設定する
        val listView: ListView = findViewById(R.id.chats_list) as ListView
        listView.setAdapter(adapter)

        listView.setOnItemClickListener { _, view, _, _ ->
            // タップしたアイテムの文字を取得
            val textView = view.findViewById<TextView>(android.R.id.text1)
            // トーストを表示
            Toast.makeText(this, "Clicked: ${textView.text}", Toast.LENGTH_SHORT).show()

            // ChatlistActivityを表示
            val chatviewIntent = Intent(this, ChatviewActivity::class.java)
            // 遷移先に値を渡す
            chatviewIntent.putExtra("TEXT_KEY", textView.text)
            // 遷移
            startActivity(chatviewIntent)
        }

        floatingActionButton3.setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("ユーザー検索")
                    .setPositiveButton("ok"){ dialog, which ->
                    }.show()
        }
    }
}