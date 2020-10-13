package com.charles.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvNombre, tvFecha, tvTelefono, tvMail, tvDescripcion;
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvFecha = (TextView)findViewById(R.id.tvFecha);
        tvTelefono = (TextView)findViewById(R.id.tvTelefono);
        tvMail = (TextView)findViewById(R.id.tvMail);
        tvDescripcion = (TextView)findViewById(R.id.tvDescripcion);
        btnEdit = (Button)findViewById(R.id.btnEdit);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarDatos();
    }

    private void mostrarDatos(){
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String fecha = datos.getString("date");
        String telefono = datos.getString("phone");
        String mail = datos.getString("email");
        String descripcion = datos.getString("description");

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvFecha.setText(fecha);
        tvMail.setText(mail);
        tvDescripcion.setText(descripcion);
    }
}