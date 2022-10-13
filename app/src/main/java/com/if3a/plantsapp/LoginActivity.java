package com.if3a.plantsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_fullname);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.trim().equals(null)){
                    etUsername.setError("Nama Tidak Boleh Kosong");
                }
                else if(password.trim().equals(null)){
                    etPassword.setError("Password Tidak Boleh Kosong");
                }
                else{
                    Toast.makeText(LoginActivity.this, "Anda Sudah Login!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}