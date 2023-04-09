package com.example.landingpageactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register2Activity extends AppCompatActivity {

    private EditText etUsername, etEmail, etPassword, etConfirmPassword;
    private Button btnRegister;
    private TextView tvLogin;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private View _bg__register;
    private View rectangle_4;
    private View rectangle_164;
    private View rectangle_159;
    private TextView username;
    private ImageView account_circle;
    private View line_28;
    private View rectangle_165;
    private TextView email;
    private View line_29;
    private View rectangle_166;
    private TextView password;
    private View line_30;
    private ImageView key;
    private View rectangle_167;
    private TextView konfirmasi_password;
    private View line_31;
    private ImageView key_ek1;
    private TextView buat_akun_baru;
    private View rectangle_6;
    private TextView register;
    private TextView sudah_memiliki_akun_;
    private TextView log_in;
    private ImageView mail_1;
    private ImageView vector;
    private ImageView mobil_2;
    private TextView molen;
    private TextView si;

    public Register2Activity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);


        _bg__register = (View) findViewById(R.id._bg__register);
        rectangle_4 = (View) findViewById(R.id.rectangle_4);
        rectangle_164 = (View) findViewById(R.id.rectangle_164);
        rectangle_159 = (View) findViewById(R.id.rectangle_159);
        username = (TextView) findViewById(R.id.username);
        account_circle = (ImageView) findViewById(R.id.account_circle);
        line_28 = (View) findViewById(R.id.line_28);
        rectangle_165 = (View) findViewById(R.id.rectangle_165);
        email = (TextView) findViewById(R.id.email);
        line_29 = (View) findViewById(R.id.line_29);
        rectangle_166 = (View) findViewById(R.id.rectangle_166);
        password = (TextView) findViewById(R.id.password);
        line_30 = (View) findViewById(R.id.line_30);
        key = (ImageView) findViewById(R.id.key);
        rectangle_167 = (View) findViewById(R.id.rectangle_167);
        konfirmasi_password = (TextView) findViewById(R.id.konfirmasi_password);
        line_31 = (View) findViewById(R.id.line_31);
        key_ek1 = (ImageView) findViewById(R.id.key_ek1);
        buat_akun_baru = (TextView) findViewById(R.id.buat_akun_baru);
        rectangle_6 = (View) findViewById(R.id.rectangle_6);
        register = (TextView) findViewById(R.id.register);
        sudah_memiliki_akun_ = (TextView) findViewById(R.id.sudah_memiliki_akun_);
        log_in = (TextView) findViewById(R.id.log_in);
        mail_1 = (ImageView) findViewById(R.id.mail_1);
        vector = (ImageView) findViewById(R.id.vector);
        mobil_2 = (ImageView) findViewById(R.id.mobil_2);
        molen = (TextView) findViewById(R.id.molen);
        si = (TextView) findViewById(R.id.si);

            // Inisialisasi shared preferences dan editor
            sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
            editor = sharedPreferences.edit();

            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = etUsername.getText().toString();
                    String email = etEmail.getText().toString();
                    String password = etPassword.getText().toString();
                    String confirmPassword = etConfirmPassword.getText().toString();

                    // Simpan informasi pendaftaran pengguna ke dalam sistem
                    editor.putString("username", username);
                    editor.putString("email", email);
                    editor.putString("password", password);
                    editor.apply();

                }
            });

            tvLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO: kode untuk membuka Activity LoginActivity
                }
            });
        }
    }
