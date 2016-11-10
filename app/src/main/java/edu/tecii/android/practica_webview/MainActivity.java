package edu.tecii.android.practica_webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://www.google.com.mx/?gws_rd=ssl");
    }
}