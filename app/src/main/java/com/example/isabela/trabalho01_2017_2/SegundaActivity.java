package com.example.isabela.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String Nome = (String) intent.getSerializableExtra("Nome");

        TextView txtNome = (TextView) findViewById(R.id.txt_nome);
        txtNome.setText("Ola "+Nome+" seja bem vindo");


    }
}
