package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    private TextView imc;
    private TextView envejecer;
    private TextView valor;
    private TextView usuario;
    private Button button_imc;
    private Button button_envejecer;
    private Button button_valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usuario = (TextView) findViewById(R.id.usuario);

        imc = (TextView) findViewById(R.id.imc);
        button_imc = (Button) findViewById(R.id.button_imc);

        envejecer = (TextView) findViewById(R.id.envejecer);
        button_envejecer = (Button) findViewById(R.id.button_envejecer);

        valor = (TextView) findViewById(R.id.valor);
        button_valor = (Button) findViewById(R.id.button_valor);


        Bundle objPedido = getIntent().getExtras();
        Pedido pedid= null;


        if(objPedido != null){
            pedid = (Pedido) objPedido.getSerializable("Pedido");

            double rsimc = pedid.getpeso()/(pedid.getestatura()*pedid.getestatura());
            final int[] rsenvejecer = {pedid.getedad()};
            double rsvalor = pedid.getdinero()*0.19;

            usuario.setText(pedid.getnombre()+' '+ pedid.getapellido());

            button_imc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imc.setText(String.valueOf(rsimc)); ;
                }
            });
            button_envejecer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    envejecer.setText(String.valueOf(++rsenvejecer[0])); ;
                }
            });
            button_valor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valor.setText(String.valueOf(rsvalor)); ;
                }
            });

        }

    }
}
