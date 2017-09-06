package com.example.boss.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static Button button_sbm;
    private static EditText url_text;
    private static WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openurl();
    }

    public void openurl(){
        button_sbm = (Button) findViewById(R.id.btnwebcheck);
        url_text = (EditText) findViewById(R.id.textView);
        browser = (WebView) findViewById(R.id.webcheck);

        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = url_text.getText().toString();
                browser.getSettings().setLoadsImagesAutomatically(true);
                browser.getSettings().setJavaScriptEnabled(true);
                browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                browser.loadUrl(url);

            }
        });
    }
}
