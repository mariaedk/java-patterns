package com.estudos.padroes.factory;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe Pizza
 */
public class Pizza implements ItemCardapio {

    @Override
    public String getDescricao() {
        return "Pizza de Calabresa";
    }

    @Override
    public double getPreco() {
        return 25.0;
    }
}
