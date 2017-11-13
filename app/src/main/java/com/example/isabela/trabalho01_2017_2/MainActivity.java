package com.example.isabela.trabalho01_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcular;
    private EditText txtNumero;
    private EditText txtSalario;
    private EditText txtNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNome = (EditText) findViewById(R.id.txt_nome);
        txtSalario = (EditText) findViewById(R.id.txt_salario);
        txtNumero = (EditText) findViewById(R.id.txt_numero);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);



    }
}
