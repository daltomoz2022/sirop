package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresarOperacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_operacion);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ingresar Operación");
    }

    public void ingresarOperacionTratador(View view){
        Intent ingresaroperactratador = new Intent(IngresarOperacionActivity.this, TratadorActivity.class);
        startActivity(ingresaroperactratador);
    }
}