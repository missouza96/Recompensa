package com.milenasouza.recompensa;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.milenasouza.recompensa.bancodedados.PontoRepository;
import com.milenasouza.recompensa.model.Ponto;

import java.util.ArrayList;

public class InicioActivity extends AppCompatActivity {

    private ListView listPontos;
    private String[] itens = {
        "100","50","20","15","150,32","89,50","12","24"};

    //private TextView totalPontos; //fazer a soma dos pontos e mostrar
    //private ArrayList<Ponto> pontos;
    //private ArrayAdapter<Ponto> adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_inicio);

        listPontos = findViewById(R.id.listPonto);

        //criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        //add adaptador na lista
        listPontos.setAdapter(adaptador);


/*
        criarAdapter();
        listPontos.setAdapter(adapter);
        listPontos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ponto pontoEscolhido = pontos.get(position);
                Toast.makeText(getApplicationContext(), "Pedido referente: " + pontoEscolhido.getPedidoPonto(), Toast.LENGTH_SHORT).show();

            }
        });

        listPontos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                final Ponto pontoEscolhido = pontos.get(position);
                AlertDialog.Builder alerta = new AlertDialog.Builder(InicioActivity.this);
                alerta.setMessage("Deseja excluir esse ponto?").setTitle("Atenção");
                alerta.setPositiveButton("sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        pontos.remove(pontoEscolhido);
                        adapter.notifyDataSetChanged();
                    }
                });

                alerta.setNegativeButton("não", null);
                alerta.show();
                return true;
            }
        });
    }


    private void criarAdapter(){
        pontos = PontoRepository.getPontos();
        adapter = new ArrayAdapter<>(InicioActivity.this,R.layout.fragment_inicio, pontos); */

    }
}
