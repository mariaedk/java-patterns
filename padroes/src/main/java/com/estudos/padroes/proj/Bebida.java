package com.estudos.padroes.proj;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe Bebida
 */
public class Bebida implements ItemCardapio {

    private String descricao;
    private double preco;

    public Bebida() {

    }

    public Bebida(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
