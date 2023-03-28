package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginactivity extends AppCompatActivity {

    EditText edtmail, password;
    Button btnLogin;
    String mail = "", pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        initview();
    }

    private void initview() {

        edtmail = findViewById(R.id.edtmail);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mail = edtmail.getText().toString();
                pass = password.getText().toString();
                Toast.makeText(Loginactivity.this, "your mail id & password is==>>" + mail + "  " + pass, Toast.LENGTH_SHORT).show();


            }
        });
    }

}