package com.example.jhon.holamundoseratic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class HolaMundoActivity extends AppCompatActivity implements View.OnClickListener {
    TextView holaMundo;
    Button button;
    EditText textoNuevo;
    CheckBox amarillo,noAmarillo,noExiste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        holaMundo = (TextView) findViewById(R.id.texto_hola_mundo);
        button = (Button) findViewById(R.id.boton);
        textoNuevo = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);
        amarillo = (CheckBox) findViewById(R.id.amarillo);
        amarillo.setOnClickListener(this);
        noAmarillo = (CheckBox) findViewById(R.id.no_amarillo);
        noAmarillo.setOnClickListener(this);
        noExiste = (CheckBox) findViewById(R.id.no_existe);
        noExiste.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.boton:
            String text = textoNuevo.getText().toString();
            holaMundo.setText(text);
                break;
            case R.id.amarillo:
                if (amarillo.isChecked()){
                    Toast.makeText(this, "Dogue es amarillo", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "Dogue no es amarillo", Toast.LENGTH_SHORT).show();
                    
                }
                break;
            
            case R.id.no_amarillo:
                if (noAmarillo.isChecked()){
                    Toast.makeText(HolaMundoActivity.this, "Dogue no no es amarillo", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(HolaMundoActivity.this, "Dogue no si es amarillo", Toast.LENGTH_SHORT).show();
                }
                break;
            
            case R.id.no_existe:
                if (noExiste.isChecked()){
                    Toast.makeText(HolaMundoActivity.this, "Dogue no Existe", Toast.LENGTH_SHORT).show();   
                }
                else {
                    Toast.makeText(HolaMundoActivity.this, "Dogue si existe", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
