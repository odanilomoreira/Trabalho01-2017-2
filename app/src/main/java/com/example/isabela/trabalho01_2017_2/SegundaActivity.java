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
        String nome = (String) intent.getSerializableExtra("nome");
        String salarioH = (String) intent.getSerializableExtra("salarioH");
        String numero = (String) intent.getSerializableExtra("numero");

        TextView printNome =  findViewById(R.id.printNome);
        TextView printSalario =  findViewById(R.id.printSalario);
        TextView printIR =  findViewById(R.id.printIR);
        TextView printINSS =  findViewById(R.id.printINSS);
        TextView printSindicato =  findViewById(R.id.printSindicato);
        TextView printSLiquido =  findViewById(R.id.printSLiquido);

        double decSalarioH = Double.parseDouble(salarioH);
        double decNumero = Double.parseDouble(numero);

        double salarioBruto = decSalarioH*decNumero;
        double IR = salarioBruto*0.11;
        double INSS = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double sLiquido = salarioBruto - IR - INSS - sindicato;

        printNome.setText("Nome: "+nome);
        printSalario.setText("a.+Salário Bruto: R$ "+salarioBruto);
        printIR.setText("b.-IR (11%): R$ "+IR);
        printINSS.setText("c.-INSS (8%): R$ "+INSS);
        printSindicato.setText("d.-Sindicato (5%): R$ "+sindicato);
        printSLiquido.setText("e.= Salário Líquido: R$ "+sLiquido);

    }
}
