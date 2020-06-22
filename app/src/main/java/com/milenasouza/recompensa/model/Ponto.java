package com.milenasouza.recompensa.model;

import androidx.annotation.NonNull;

public class Ponto {
    private String pedidoPonto;
    private String valorPonto;
    private String idPonto;

    // add id ao ponto
    public Ponto addId(String idPonto){
        setIdPonto(idPonto);
        return this;
    }

    // add pedido no ponto
    public Ponto addPedido(String pedidoPonto){
        setPedidoPonto(pedidoPonto);
        return this;
    }

    // add valor ao ponto
    public Ponto addValor(String valorPonto){
        setValorPonto(valorPonto);
        return this;
    }

    // getters
    public String getIdPonto() {return idPonto;}
    public String getPedidoPonto() {return pedidoPonto;}
    public String getValorPonto() {return valorPonto;}


    //setters
    public void setIdPonto(String idPonto) {this.idPonto = idPonto;}
    public void setPedidoPonto(String pedidoPonto) { this.pedidoPonto = pedidoPonto;}
    public void setValorPonto(String valorPonto) {this.valorPonto = valorPonto;}

    @NonNull
    @Override
    public String toString(){
        return "Ponto cadastrado com sucesso!";
    }

}
