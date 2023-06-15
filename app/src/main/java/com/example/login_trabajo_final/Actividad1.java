package com.example.login_trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    EditText cantidad;
    RadioButton  iva19, descuento;
    TextView subtotal, iva, total , descuentotv;
    String cantidad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        //Asociamos los objetos xml con los objetos java

        cantidad = findViewById(R.id.etcantidad);
        iva19= findViewById(R.id.rbiva19);
        descuento = findViewById(R.id.rbdecuento);
        descuentotv = findViewById(R.id.tvdescuento);
        subtotal = findViewById(R.id.tvsubtotal);
        iva= findViewById(R.id.tviva);
        total=findViewById(R.id.tvtotal);


    }//Fin Oncreate

    public void Calcular(View view){
        //Pasar la informacion de los objetos a variables
        cantidad1 = cantidad.getText().toString();
        if (cantidad1.isEmpty() || cantidad1.equals("0")){
            Toast.makeText(this, "La cantidad es requerida", Toast.LENGTH_SHORT).show();
            cantidad.requestFocus();
        }else{
            int can_tidad;
            double iva1, descuento1, usuario1 = 1400000;
            //Conversiones de String a integer
            can_tidad = Integer.parseInt(cantidad1);
            if(iva19.isChecked()){
                iva1 = 19;
            }else{
                iva1 = 0;
            }if (descuento.isChecked()){
                descuento1 = 10;
            }else{
                descuento1 = 0;
            }
            ClsCalculos Ob_calculos = new ClsCalculos(usuario1, can_tidad,descuento1,iva1 );
            //Operaciones
            //Imprimir resultados
            descuentotv.setText((int) Ob_calculos.Calcular_valor_descuento());
            subtotal.setText((int) Ob_calculos.Calcular_valor_bruto());
            iva.setText((int) Ob_calculos.Calcular_valor_iva());
            total.setText((int) Ob_calculos.Calcular_valor_neto());
        }
    }
}