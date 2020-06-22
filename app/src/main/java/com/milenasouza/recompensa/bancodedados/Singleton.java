package com.milenasouza.recompensa.bancodedados;

import com.milenasouza.recompensa.model.Ponto;

import java.util.ArrayList;

public class Singleton {
    private static Singleton instance;

    private static ArrayList<Ponto> pontos;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        if (pontos == null){
            pontos = new ArrayList<>();
        }
        return instance;
    }

    public void add(Ponto ponto){
        pontos.add(ponto);
    }

    public ArrayList<Ponto> getPontos(){
        return pontos;
    }

}
