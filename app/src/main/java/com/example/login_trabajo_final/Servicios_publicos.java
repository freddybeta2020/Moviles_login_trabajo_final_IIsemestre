package com.example.login_trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Servicios_publicos extends AppCompatActivity {
      EditText etagua, etenergia, etestracto ,etvaloragua, etvalorkilovatio;
      TextView tvsubtotal, tvdescuento, tvtotalpagar;
      Button btlimpiar, btcalcular, btregresar;
      String agua1, energia1, estracto1,valor_kilovatio, valor_agua;

      ClsServicios Obj_servicios = new ClsServicios();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_publicos);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        //Asociamos los objetos xml con los objetos java
        etagua = findViewById(R.id.etagua);
        etenergia = findViewById(R.id.etenergia);
        etestracto= findViewById(R.id.etestracto);
        etvaloragua=findViewById(R.id.etvaloragua);
        etvalorkilovatio =findViewById(R.id.etvalorkilovatio);
        tvsubtotal=findViewById(R.id.tvsubtotal);
        tvdescuento=findViewById(R.id.tvdescuento);
        tvtotalpagar=findViewById(R.id.tvtpagar);
        btcalcular=findViewById(R.id.btcalcular);
        btlimpiar=findViewById(R.id.btlimpiar);
        btregresar=findViewById(R.id.btregresar);

    }//Fin Oncreate

    public void Calcular(View view){
        //Pasar la informacion de los objetos a variables
        agua1 = etagua.getText().toString();
        valor_kilovatio = etvalorkilovatio.getText().toString();
        valor_agua = etvaloragua.getText().toString();
        energia1 = etenergia.getText().toString();
        estracto1 = etestracto.getText().toString();
        if ( agua1.isEmpty() || energia1.isEmpty() || estracto1.isEmpty() || valor_agua.isEmpty() || valor_kilovatio.isEmpty() ) {
            Toast.makeText(this, "La informacion es necesaria", Toast.LENGTH_SHORT).show();
            etenergia.requestFocus();

        }else{
            //Definicion de variables y conversiones
            int agua, energia, estracto;
            double valor_energia, valor_agua;
            agua = Integer.parseInt(etagua.getText().toString());
            valor_agua = Double.parseDouble(etvaloragua.getText().toString());
            energia= Integer.parseInt(etenergia.getText().toString());
            valor_energia = Double.parseDouble(etvalorkilovatio.getText().toString());
            estracto = Integer.parseInt(etestracto.getText().toString());
            if (estracto < 0 || estracto > 6){
                Toast.makeText(this, "Los estratos estan entre 1 y 6", Toast.LENGTH_SHORT).show();
                etestracto.requestFocus();
            }else{
                //enviar la informacion a la clase
                Obj_servicios.setEstracto(estracto);
                Obj_servicios.setKilovatio(energia);
                Obj_servicios.setValor_kilov(valor_energia);
                Obj_servicios.setMetro_cubico(agua);
                Obj_servicios.setValor_metroc(valor_agua);
                //Operaciones
                Obj_servicios.Calcular_Consumo();
                //Imprimir resultados
                tvsubtotal.setText(String.valueOf(Obj_servicios.getSubtotal()));
                tvdescuento.setText(String.valueOf(Obj_servicios.getDescuento()));
                tvtotalpagar.setText(String.valueOf(Obj_servicios.getTotal_pagar()));

            }

        }
    }//fin calcular

    public void Limpiar(View view){
        etagua.setText("Metros cubicos agua");
        etvaloragua.setText("Valor metro cubico agua");
        etenergia.setText("Cantidad kilovatios");
        etvalorkilovatio.setText("Valor kilovatio");
        etestracto.setText("Estracto vivienda");
        tvsubtotal.setText("Subtotal Agua Y Energia");
        tvdescuento.setText("Descuento");
        tvtotalpagar.setText("Total a Pagar");
    }

    public void Regresar(View vie){
        Intent segunda_pantalla = new Intent(this, Segunda_pantalla.class);
        startActivity(segunda_pantalla);
    }


}