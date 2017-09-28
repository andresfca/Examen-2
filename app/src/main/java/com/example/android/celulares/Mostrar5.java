package com.example.android.celulares;

import android.content.res.Resources;
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
    private String res;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar5);
        resources = this.getResources();

        mostrar = (TextView) findViewById(R.id.txtMostrar);
        celulares = Datos.guardar();
        int cont = 0;
        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca().equalsIgnoreCase("apple")) {
                if (celulares.get(i).getColor().equalsIgnoreCase("negro")) {
                    cont++;
                }
            }
        }
        res=resources.getString(R.string.mensajeApple)+ "\n"+ cont;
        mostrar.setText(res);
    }
}
