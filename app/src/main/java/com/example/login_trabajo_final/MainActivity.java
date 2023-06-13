package com.example.login_trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etcontraseña, etusuario;
    Button btlogin;
    String contraseña, usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra de titulo por defecto, asociar los objetos Java y Xml
        getSupportActionBar().hide();
        //Asociamos los objetos xml con los objetos java
        etcontraseña = findViewById(R.id.etcontraseña);
        etusuario = findViewById(R.id.etusuario);
        btlogin = findViewById(R.id.btlogin);

    }

    public void Login(View view){
        //Pasar la informacion de los objetos a variables
        contraseña = etcontraseña.getText().toString();
        usuario = etusuario.getText().toString();
        //validacion de que los campos no estan vacios
        if (contraseña.isEmpty() || usuario.isEmpty()) {
            Toast.makeText(this, "El usuario y contraseña son requerido", Toast.LENGTH_SHORT).show();
            etusuario.requestFocus();
        }else{
            int contador = 3;
            for (int i = 3; i == 0; i --){
                if (usuario == "cesde" && contraseña == "12345"){
                    Intent actividad1 = new Intent(this,Actividad1.Class);
                    startActivity(actividad1);
                }else{

                }


            }
        }

    }