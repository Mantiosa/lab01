package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonChangeTextClick(View view) {
        TextView textView1 = (TextView)findViewById((R.id.textView1));
        textView1.setText("Bye");
    }

    public void buttonChangeTextColorClick(View view) {
        TextView textView1 = (TextView)findViewById((R.id.textView1));
        textView1.setTextColor(Color.RED);
    }
}