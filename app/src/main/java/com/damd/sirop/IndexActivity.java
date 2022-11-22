package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Inicio SIROP");
    }

    public void ingresar(View view){
        Intent ingresar = new Intent(IndexActivity.this, LoginActivity.class);
        startActivity(ingresar);
    }

    public void ingresaTratador(View view){
        Intent ingtratador = new Intent(IndexActivity.this, TratadorActivity.class);
        startActivity(ingtratador);
    }

    public void ingresaComandante(View view){
        Intent ingcomandante = new Intent(IndexActivity.this, ComandanteActivity.class);
        startActivity(ingcomandante);
    }
}