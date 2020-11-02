package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.buttondemo.R.id.center;
import static com.example.buttondemo.R.id.login;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button login,logout;
    private TextView textView;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logout = (Button) findViewById(R.id.logout);
         login = (Button)findViewById(R.id.login);
        textView = (TextView)findViewById(R.id.textView);
        login.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast toast;
        if(v.getId()==R.id.login) {
            Log.d("Tag","Login button is clicked");
        } else {
             Log.d("Tag","Logout Button is clicked");
        }


    }
}