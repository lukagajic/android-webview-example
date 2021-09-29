package com.lgajic.primerwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonOpenWebPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOpenWebPage = findViewById(R.id.button_open_webpage);
        buttonOpenWebPage.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_open_webpage:
                openWebPage();
                break;
        }
    }

    private void openWebPage() {
        Intent i = new Intent(this, WebActivity.class);

        Bundle bundle = new Bundle();
        i.putExtra("url", "https://www.bbc.com/");

        startActivity(i);
    }
}