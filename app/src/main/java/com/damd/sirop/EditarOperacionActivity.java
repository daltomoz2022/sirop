package com.damd.sirop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditarOperacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_operacion);
        //Establecer el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Editar Operación");
    }

    public void editarOperacionTratador(View view){
        Intent editaroperactratador = new Intent(EditarOperacionActivity.this, TratadorActivity.class);
        startActivity(editaroperactratador);
    }
}