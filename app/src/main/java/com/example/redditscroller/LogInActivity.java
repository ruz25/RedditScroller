package com.example.redditscroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        presenter = new LoginPresenter(this);

        Button next = findViewById(R.id.bToMain);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.next();
            }
        });
    }
}