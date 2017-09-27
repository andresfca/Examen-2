package com.example.android.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Mostrar5 extends AppCompatActivity {
    private TableLayout tabla;
    ArrayList<Celular> celulares;
    private TextView mostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar5);
        mostrar = (TextView) findViewById(R.id.txtMostrar);
        tabla = (TableLayout) findViewById(R.id.tabla3);
        celulares = Datos.guardar();
        for (int i = 0; i < celulares.size(); i++) {
            int cont = 0;
            if (celulares.get(i).getMarca().equalsIgnoreCase("apple")) {
                if (celulares.get(i).getSo().equalsIgnoreCase("negro")) {
                    cont++;

                }
            }


        }
    }
}
