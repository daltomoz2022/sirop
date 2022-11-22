package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class TratadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratador);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Perfil Tratador");
    }

    public void tratadorInicio(View view){
        Intent tratadorinicio = new Intent(TratadorActivity.this, IndexActivity.class);
        startActivity(tratadorinicio);
    }

    public void tratadorAgregar(View view){
        Intent tratadorAgrega = new Intent(TratadorActivity.this, IngresarOperacionActivity.class);
        startActivity(tratadorAgrega);
    }

    public void tratadorEditar(View view){
        Intent tratadorEdita = new Intent(TratadorActivity.this, EditarOperacionActivity.class);
        startActivity(tratadorEdita);
    }
}