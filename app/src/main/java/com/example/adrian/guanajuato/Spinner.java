package com.example.adrian.guanajuato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.adrian.guanajuato.Adapters.AdapterLugar;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import com.example.adrian.guanajuato.database.Database;


public class Spinner extends AppCompatActivity {
    Database database;
    RecyclerView rv_lugares;
    String[] ciudades;
    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        database=new Database(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        rv_lugares=findViewById(R.id.lista);
        ciudades=database.getciudad();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,ciudades);
        final MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.spinner);
        materialDesignSpinner.setAdapter(arrayAdapter);

        materialDesignSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                rv_lugares.setAdapter(new AdapterLugar(Spinner.this, database.get_lugar(materialDesignSpinner.getText().toString())));
                rv_lugares.setLayoutManager(new LinearLayoutManager(Spinner.this));
            }
        });
        rv_lugares.setAdapter(new AdapterLugar(this, database.get_lugar("todos")));
        rv_lugares.setLayoutManager(new LinearLayoutManager(this));


    }
}
