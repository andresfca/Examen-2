package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mostrar extends AppCompatActivity {
    private ListView ls;
    private Resources resources;
    private String[] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        ls=(ListView)findViewById(R.id.lvMostrar);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.arrayOpcMostrar);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,opc);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Mostrar.this, Mostrar1.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Mostrar.this, Mostrar2.class);
                        startActivity(in);
                        break;
                    case 2:
                        in=new Intent(Mostrar.this,Mostrar3.class);
                        startActivity(in);
                        break;
                    case 3:
                        in=new Intent(Mostrar.this,Mostrar4.class);
                        startActivity(in);
                        break;
                    case 4:
                        in=new Intent(Mostrar.this,Mostrar5.class);
                        startActivity(in);
                        break;
                    case 5:
                        in=new Intent(Mostrar.this,Mostrar6.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
