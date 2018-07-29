package br.com.fiap.imccalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){

        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);
        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());

        double resultado = peso / (altura * altura);
        Toast.makeText(this, "Índice:" + resultado, Toast.LENGTH_LONG).show();
        if(resultado < 19)
            lblResultado.setText("Você está abaixo do peso!");
        else if(resultado > 32)
            lblResultado.setText("Você está acima do peso!");
        else
            lblResultado.setText("Tá tudo ok!");
    }
}