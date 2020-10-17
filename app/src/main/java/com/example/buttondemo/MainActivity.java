package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button logout = (Button) findViewById(R.id.logout);
        Button login = (Button)findViewById(R.id.login);
        textView = (TextView)findViewById(R.id.textView);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                textView.setText("Logout button is clicked " + c + " times. ");
            }
        });
        c = 0;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                textView.setText("Login button is clicked " + c + " times. ");
            }
        });
    }
}