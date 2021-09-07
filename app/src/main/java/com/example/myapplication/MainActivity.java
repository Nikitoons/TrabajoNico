package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auto;
    ToggleButton full;
    TextInputEditText text1;
    RadioButton r1, r2;
    Button guardar;
    EditText comentario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto = (AutoCompleteTextView) findViewById(R.id.MiCampoCompletable);
        String[] modelos = getResources().getStringArray(R.array.modelos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, modelos);
        auto.setAdapter(adapter);

        full = (ToggleButton) findViewById(R.id.Full);

        text1 = (TextInputEditText) findViewById(R.id.Marca);

        r1 = (RadioButton) findViewById(R.id.rb1);
        r2 = (RadioButton) findViewById(R.id.rb2);




        guardar = findViewById(R.id.Guardar);

        comentario = findViewById(R.id.Comentario);

    }


    public void obtener(View boton) {
        String autoU = "";
        String fullU = "";
        String textU = "";
        String r1U = "";
        String r2U = "";

        autoU = auto.getText().toString();
        fullU = full.getText().toString();
        textU = text1.getText().toString();
        r1U = r1.getText().toString();
        r2U = r2.getText().toString();

        comentario.setText("");
        comentario.append("Modelo del Vehiculo = "+autoU+"\n");
        comentario.append("Full Equipo = "+fullU+"\n");
        comentario.append("Marca del Vehiculo = "+textU+"\n");

        if (r1.isChecked()){
            comentario.append("Tipo de combustible = "+ r1U);
        }else{
            comentario.append("Tipo de combustible = "+ r2U);
        }



    }










    public void onclick(View view) {
    }
}
