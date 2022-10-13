package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText producto1;
    private EditText producto2;
    private EditText producto3;
    private EditText producto4;
    private Button boton_registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        producto1 = (EditText) findViewById(R.id.producto1);
        producto2 = (EditText) findViewById(R.id.producto2);
        producto3 = (EditText) findViewById(R.id.producto3);
        producto4 = (EditText) findViewById(R.id.producto4);
        boton_registrar = (Button) findViewById(R.id.boton_registrar);

        boton_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validacion()){
                    int producto1p = Integer.parseInt(producto1.getText().toString());
                    int producto2p = Integer.parseInt(producto2.getText().toString());
                    int producto3p = Integer.parseInt(producto3.getText().toString());
                    int producto4p= Integer.parseInt(producto4.getText().toString());


                    Pedido pde = new Pedido (producto1p ,producto2p,producto3p,producto4p);

                    Intent miIntent = new Intent (MainActivity.this,Activity_2.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("Pedido",pde);

                    miIntent.putExtras(bundle);
                    startActivity(miIntent);
                }
            }
        });
    }
    public boolean validacion() {
        boolean result = true;

        String valor =  producto1 .getText().toString();
        String valor1 =  producto2.getText().toString();
        String valor2 =  producto3 .getText().toString();
        String valor3 =  producto4.getText().toString();


        if(valor.isEmpty()){
            producto1 .setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor1.isEmpty()){
            producto2 .setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor2.isEmpty()){
            producto3 .setError("Tiene que completar el campo vacio");
            result = false;
        }
        if(valor3.isEmpty()){
            producto4 .setError("Tiene que completar el campo vacio");
            result = false;
        }

        return result;
    }

}