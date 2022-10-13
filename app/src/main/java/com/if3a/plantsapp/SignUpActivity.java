package com.if3a.plantsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private EditText etFullName, etEmail, etPassword, etConfirmPassword;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etFullName = findViewById(R.id.et_fullname);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_confirmpassword);
        btnSignup = findViewById(R.id.btn_signup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = etFullName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String confirmpassword = etConfirmPassword.getText().toString();

                if(fullname.trim().equals(null)){
                    etFullName.setError("Nama Tidak Boleh Kosong");
                }
                else if(email.trim().equals(null)){
                    etEmail.setError("Email Tidak Boleh Kosong");
                }
                else if(password.trim().equals(null)){
                    etPassword.setError("Password Tidak Boleh Kosong");
                }
                else if(confirmpassword.trim().equals(null)){
                    etConfirmPassword.setError("Confirm Password Tidak Boleh Kosong");
                }
                else if(confirmpassword.trim() != password.trim()){
                    etConfirmPassword.setError("Confirm Password Tidak Sesuai");
                }
                else{
                    Toast.makeText(SignUpActivity.this, "Anda Sudah SignUp!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}