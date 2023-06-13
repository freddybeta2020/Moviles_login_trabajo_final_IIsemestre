package com.example.login_trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    EditText cantidad;
    RadioButton iva0, iva19, descuento;
    TextView subtotal, iva, total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        //Asociamos los objetos xml con los objetos java

        cantidad = findViewById(R.id.etcantidad);
        iva0 = findViewById(R.id.rbiva0);
        iva19= findViewById(R.id.rbiva19);
        descuento = findViewById(R.id.rbdecuento);
        subtotal = findViewById(R.id.tvsubtotal);
        iva= findViewById(R.id.tviva);
        total=findViewById(R.id.tvtotal);


    }//Fin Oncreate

    
}