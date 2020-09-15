package dev.jsmith.communitywrapper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    private String getURL(){
        //https://jsmithdev-developer-edition.na85.force.com // Salesforce community
        //https://jsmith.dev // https site
        //https://imma.dev // https with a redirect
        return "https://jsmithdev-developer-edition.na85.force.com";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webviewid);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setDomStorageEnabled(true);

        webView.loadUrl( getURL() );

        webView.setWebViewClient(new WebViewClient());
    }
}