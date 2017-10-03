package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/*application By Sukrit khadlae Rmutsv ICT*/
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    //public static final String message1 = "message1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btncontacT = (Button) findViewById(R.id.btn_contect2222);
        btncontacT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent312312 = new Intent(MainActivity.this, Contact.class);
                startActivity(intent312312);
            }
        });
        
        
    }
    public void btn_Login(View view) {
        Intent intent = new Intent(this, activity_display_message.class);
        /*EditText editText = (EditText) findViewById(R.id.et_text1);
        String message = editText.getText().toString();
        intent.putExtra(message1, message);*/
        startActivity(intent);
    }

    public void btn_register(View view){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    

}