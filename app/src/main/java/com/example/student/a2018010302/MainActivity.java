package com.example.student.a2018010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.webview);
      // wv.setWebViewClient(new WebViewClient());//使用瀏覽器
        wv.setWebChromeClient(new WebChromeClient());//使用估狗瀏覽器
        wv.getSettings().setJavaScriptEnabled(true);//把JS功能打開
        wv.loadUrl("http://www.youtube.com");
        wv.loadData("<iframe width=\"480\" height=\"300\" src=\"https://www.youtube.com/embed/JwjBbWQs71k\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>", "text/html; charset=UTF-8", null);

    }
}
