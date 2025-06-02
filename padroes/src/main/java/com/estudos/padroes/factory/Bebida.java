package com.estudos.padroes.factory;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe Bebida
 */
public class Bebida implements ItemCardapio {
    @Override
    public String getDescricao() {
        return "Suco de laranja";
    }

    @Override
    public double getPreco() {
        return 8.0;
    }
}
