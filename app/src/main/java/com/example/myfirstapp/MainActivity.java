package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etUsername = (EditText) findViewById(R.id.et_text1);
        final EditText etPassword = (EditText) findViewById(R.id.et_text2);
        final Button btnLogin = (Button) findViewById(R.id.button111);


        final Button btncontacT = (Button) findViewById(R.id.btnM_Contact212);
        btncontacT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent312312 = new Intent(MainActivity.this, Contact.class);
                startActivity(intent312312);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success){
                                String name = jsonResponse.getString("name");
                                Intent intent = new Intent(MainActivity.this, activity_display_message.class);
                                intent.putExtra("name", name);
                                intent.putExtra("username", username);

                                MainActivity.this.startActivity(intent);
                            }
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setMessage("Login Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(username, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                queue.add(loginRequest);
            }
        });
        
        
    }
    public void btn_Login(View view) {
        Intent intent = new Intent(this, activity_display_message.class);
        startActivity(intent);
    }

    public void btn_register(View view){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    

}