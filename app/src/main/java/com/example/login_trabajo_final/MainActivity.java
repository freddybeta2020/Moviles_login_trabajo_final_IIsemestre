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

    }//Fin Oncreate

    public void Login(View view) {
        //Pasar la informacion de los objetos a variables
        contraseña = etcontraseña.getText().toString();
        usuario = etusuario.getText().toString();
        //validacion de que los campos no estan vacios
        if (contraseña.isEmpty() || usuario.isEmpty()) {
            Toast.makeText(this, "El usuario y contraseña son requeridos", Toast.LENGTH_SHORT).show();
            etusuario.requestFocus();
        } else {
            int contador = 3;

                if (usuario == "cesde" && contraseña == "12345") {
                    Intent Segunda_pantalla = new Intent(MainActivity.this, com.example.login_trabajo_final.Segunda_pantalla.class);
                    startActivity(Segunda_pantalla);
                } else {
                    Toast.makeText(this, "El usuario o la contraseña son incorrectas", Toast.LENGTH_SHORT).show();
                    contador--;
                    if (contador == 0){
                    btlogin.setEnabled(false);
                        Toast.makeText(this, "Has superado el numero de intentos", Toast.LENGTH_SHORT).show();
                }


            }
        }

    }

}