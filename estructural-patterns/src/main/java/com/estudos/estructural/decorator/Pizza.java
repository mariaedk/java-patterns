package com.estudos.estructural.decorator;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 18/09/2025
 * @description Classe Pizza
 */
public class Pizza implements Item {
    private String sabor;

    public Pizza(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String descricao() {
        return "Pizza de " + sabor;
    }
}
