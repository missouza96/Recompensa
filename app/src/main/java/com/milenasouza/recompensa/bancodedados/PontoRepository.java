package com.milenasouza.recompensa.bancodedados;

import com.milenasouza.recompensa.model.Ponto;

import java.util.ArrayList;

public class PontoRepository {
    public static ArrayList<Ponto> getPontos(){
        ArrayList<Ponto> pontoArrayList = Singleton.getInstance().getPontos();
        return pontoArrayList;
    }
    public static void add(Ponto ponto) {
        Singleton.getInstance().add(ponto);
    }
}
