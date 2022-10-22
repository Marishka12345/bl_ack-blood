package com.example.homeapteka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_author.*

class aboutAuthor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_author)
        web.webViewClient = WebViewClient()
        web.loadUrl("file:///android_asset/mypage.html")
        web.settings.javaScriptEnabled = true
    }
}