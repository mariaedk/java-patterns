package com.estudos.estructural.decorator;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 18/09/2025
 * @description Classe DecoratorMain
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Item pizza = new Pizza("Calabresa");
//        pizza = new QueijoExtra(pizza);
        System.out.println(pizza.getClass());
        System.out.println(pizza.descricao());
    }
}
