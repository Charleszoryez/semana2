package com.charles.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, fecha, telefono, mail, descripcion;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.editNombre);
        fecha = (EditText)findViewById(R.id.editFecha);
        telefono = (EditText)findViewById(R.id.editTelofono);
        mail = (EditText)findViewById(R.id.editMail);
        descripcion = (EditText)findViewById(R.id.editDescripcion);
        siguiente = (Button) findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String date = fecha.getText().toString();
                String phone = telefono.getText().toString();
                String emial = mail.getText().toString();
                String description = descripcion.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarDatos.class);

                i.putExtra("name", name);
                i.putExtra("date", date);
                i.putExtra("phone", phone);
                i.putExtra("email", emial);
                i.putExtra("description", description);

                startActivity(i);
            }
        });
    }
}