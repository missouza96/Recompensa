package com.milenasouza.recompensa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.milenasouza.recompensa.bancodedados.PontoRepository;
import com.milenasouza.recompensa.model.Ponto;

public class AddPontoActivity extends AppCompatActivity {
    private EditText editTextId;
    private EditText editTextNumeroPedido;
    private EditText editTextValorPonto;
    private Button buttonCadastrar;
    private Button buttonLimpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_ponto);
        vinculaViewPeloId();


        buttonCadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String id = editTextId.getText().toString();
                String pedido = editTextNumeroPedido.getText().toString();
                String valorPonto = editTextValorPonto.getText().toString();

                if(valido(id, pedido, valorPonto)){
                    //resultado.setText(valorPonto);
                    //Ponto ponto = new Ponto().addId(id).addPedido(pedido).addValor(valorPonto);
                    //PontoRepository.add(ponto);
                    limpar();

                } else {
                    Toast.makeText(AddPontoActivity.this,"Campo inválido",Toast.LENGTH_SHORT).show();
                }

            }
            private boolean valido(String id, String pedido, String ponto){
                if(id.isEmpty()){
                    editTextId.setError("Campo em branco!");
                    return false;
                }
                if(pedido.isEmpty()){
                    editTextNumeroPedido.setError("Campo em branco!");
                    return false;
                }
                if(ponto.isEmpty()){
                    editTextValorPonto.setError("Campo em branco!");
                    return false;
                }
                return true;
            }
        });
    }


    public void limpar() {
        editTextId.setText("");
        editTextNumeroPedido.setText("");
        editTextValorPonto.setText("");
    }


    public void vinculaViewPeloId(){
        editTextId = findViewById(R.id.editId);
        editTextNumeroPedido = findViewById(R.id.editPedido);
        editTextValorPonto = findViewById(R.id.editPonto);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonLimpar = findViewById(R.id.buttonLimpar);

    }
}
