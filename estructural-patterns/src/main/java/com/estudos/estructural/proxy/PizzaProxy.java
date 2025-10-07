package com.estudos.estructural.proxy;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 07/10/2025
 * @description Classe PizzaFactory
 */
public class PizzaProxy implements Item {

    private String sabor;
    private double preco;

    public PizzaProxy(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    @Override
    public String descricao() {
        return "Pizza de " + sabor + " de R$" + preco;
    }
}
