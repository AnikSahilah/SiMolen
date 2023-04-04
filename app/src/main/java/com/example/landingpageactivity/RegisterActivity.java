package com.example.landingpageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsername, etEmail, etPassword, etConfirmPassword;
    private Button btnRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.username_edit_text);
        etEmail = findViewById(R.id.email_edit_text);
        etPassword = findViewById(R.id.password_edit_text);
        etConfirmPassword = findViewById(R.id.confirm_password_edit_text);
        btnRegister = findViewById(R.id.register_button);
        tvLogin = findViewById(R.id.login_text_view);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                // TODO: tambahkan kode untuk menyimpan informasi pendaftaran pengguna ke dalam sistem Anda

                // setelah pendaftaran berhasil, Anda dapat membuka Activity baru atau menutup RegisterActivity
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: tambahkan kode untuk membuka Activity LoginActivity
            }
        });
    }
}
