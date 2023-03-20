package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView jtvsubtotal,jtvtotal,jtvvehiculo,jtvciudad,jtviva;
    RadioButton jrbcartagena,jrbleticia,jrbpuntaca;
    EditText jetcantidad;
    CheckBox jcbvehiculo;
    Button jbtlimpiar,jbtcalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra con el nombre de la aplicacion
        getSupportActionBar().hide();

        //Asociar los objetos XML con los objetos JAVA

        jtvsubtotal=findViewById(R.id.tvsubtotal);
        jtvvehiculo=findViewById(R.id.tvvehiculo);
        jtviva=findViewById(R.id.tviva);
        jtvciudad=findViewById(R.id.tvciudad);
        jtvtotal=findViewById(R.id.tvtotal);
        jrbcartagena=findViewById(R.id.rbcartagena);
        jrbleticia=findViewById(R.id.rbleticia);
        jrbpuntaca=findViewById(R.id.rbpuntacana);
        jetcantidad=findViewById(R.id.etcantidad);
        jcbvehiculo=findViewById(R.id.cbvehiculo);
        jbtcalcular=findViewById(R.id.btcalcular);
        jbtlimpiar=findViewById(R.id.btlimpiar);
    }

    public void calcular(View view){
        String cantidad;

        //Pasar un objeto java a un var de la RAM

        cantidad =jetcantidad.getText().toString();

        //Validar de la cantidad no este vacia

        if (cantidad.isEmpty()){
            Toast.makeText(this, "Debe ingresar la cantidad de personas", Toast.LENGTH_SHORT).show();
            jetcantidad.requestFocus();
        }

    }
}