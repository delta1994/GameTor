package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class activity_display_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        /*Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.message1);
        TextView textView = (TextView) findViewById(R.id.tv_1);
        textView.setText(message);*/
    }

    public void btn_back23(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void btn_game1(View view){
        Intent intent = new Intent(activity_display_message.this, Game1.class);
        startActivity(intent);
    }
    public void btn_game2(View view){
        Intent intent = new Intent(this, Game2.class);
        startActivity(intent);
    }
}
