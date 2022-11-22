package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ingresar");
    }

    public void iniciolog(View view){
        Intent iniciologin = new Intent(LoginActivity.this,IndexActivity.class);
        startActivity(iniciologin);
    }

    public void registrarse(View view) {
        Intent registro = new Intent(LoginActivity.this,RegistrarActivity.class);
        startActivity(registro);
    }
}
