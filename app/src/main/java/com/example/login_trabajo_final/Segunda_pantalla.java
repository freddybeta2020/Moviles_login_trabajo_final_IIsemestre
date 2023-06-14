package com.example.login_trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Segunda_pantalla extends AppCompatActivity {

    Button bcartagena, bservicios, bregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        //Asociamos los objetos xml con los objetos java

        bcartagena = findViewById(R.id.btcartagena);
        bservicios = findViewById(R.id.btserpubli);
        bregresar = findViewById(R.id.btregresar);



    }//Fin Oncreate

    public void Cartagena(View view){
        Intent Actividad1 = new Intent(this,com.example.login_trabajo_final.Actividad1.class);
        startActivity(Actividad1);
    }//fin metodo Cartagena

    public void Servicios(View view){
        Intent Servicios_publicos = new Intent(this,com.example.login_trabajo_final.Servicios_publicos.class);
        startActivity(Servicios_publicos);

    }//fin metodo Servicios

    public void Regresar(View view){
        Intent MainActivity = new Intent(this,com.example.login_trabajo_final.MainActivity.class);
        startActivity(MainActivity);

    }//Fin metodo Regresar
}