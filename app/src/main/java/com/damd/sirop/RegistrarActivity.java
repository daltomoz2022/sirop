package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class RegistrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Registrarme");
    }

    public void inicioregistro(View view){
        Intent inicioreg = new Intent(RegistrarActivity.this,IndexActivity.class);
        startActivity(inicioreg);
    }
}