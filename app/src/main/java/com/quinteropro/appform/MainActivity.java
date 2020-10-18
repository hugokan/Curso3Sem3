package com.quinteropro.appform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;

    private RecyclerView listaContactos;

    ImageView startImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);


        startImg = (ImageView) findViewById(R.id.ivStart);

        startImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(v.getContext(), Favoritas.class);
                startActivity(mainIntent);
            }
        });

        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager((this));
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/

        listaContactos.setLayoutManager(llm);
        inicializarListaContatos();
        inicializaAdaptador();




        /* ImageButton btn = (ImageButton) findViewById(R.id.ivStart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Favoritas.class);

                startActivity(intent);
            }
        });


        /*public void irFavoritos(View v){
            Intent intent = new Intent(this, Favoritas.class);
            startActivity(intent);
        }


        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto : contactos) {
            nombresContacto.add(contacto.getNombre());
        }

        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(i).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(i).getTelefono());
                startActivity(intent);
            }
        });*/

    }

    public void inicializaAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContatos(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.bullterrier, "Tank", "8", "hugo@hugo.com"));
        contactos.add(new Contacto(R.drawable.beagle, "Pepe", "5", "bee@bee.com"));
        contactos.add(new Contacto(R.drawable.pug, "Fabrizzio", "9", "pug@pug.com"));
        contactos.add(new Contacto(R.drawable.pequines,"Mamba", "6", "peq@peg.com"));
        contactos.add(new Contacto(R.drawable.bulldog, "Luna", "7", "bul@bul.com"));
    }


}