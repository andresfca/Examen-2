package com.example.android.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Mostrar1 extends AppCompatActivity {
    private TableLayout tabla;
    ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar1);
        tabla = (TableLayout)findViewById(R.id.tabla1);
        celulares = Datos.guardar();
        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila= new TableRow(this);
            TextView c1= new TextView(this);
            TextView c2= new TextView(this);
            TextView c3= new TextView(this);
            TextView c4= new TextView(this);
            TextView c5= new TextView(this);
            TextView c6= new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(""+celulares.get(i).getPrecio());
            c3.setText(""+celulares.get(i).getRam());
            c4.setText(""+celulares.get(i).getMarca());
            c5.setText(""+celulares.get(i).getSo());
            c6.setText(""+celulares.get(i).getColor());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            fila.addView(c6);

            tabla.addView(fila);
        }

    }
}
