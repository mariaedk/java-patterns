package com.estudos.padroes.proj;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe Salada
 */
public class Salada implements ItemCardapio {
    @Override
    public String getDescricao() {
        return "Salada caesar";
    }

    @Override
    public double getPreco() {
        return 18.0;
    }
}
