package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Mostrar6 extends AppCompatActivity {
    private TableLayout tabla;
    ArrayList<Celular> celulares;
    private TextView mostrar;
    private String res;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar6);
        resources = this.getResources();

        mostrar = (TextView) findViewById(R.id.txtMostrarProm);
        celulares = Datos.guardar();
        int cont = 0;
        double suma=0, prom=0;
        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca().equalsIgnoreCase("Nokia")) {
                    cont++;
                    suma = suma+celulares.get(i).getPrecio();
            }
        }
        prom=suma/cont;
        res=resources.getString(R.string.mensajeNokia)+ "\n"+ prom;
        mostrar.setText(res);
    }
}
