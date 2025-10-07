package com.estudos.estructural.proxy;

import com.estudos.estructural.decorator.Pizza;
import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 07/10/2025
 * @description Classe MainProxy
 */
public class MainProxy {

    public static void main(String[] args) {
        Item pizza = new Pizza("Portuguesa");

        Item pedidoAnonimo = new PedidoProxy(pizza, false);
        //vai lançar msg de "erro"
        System.out.println(pedidoAnonimo.descricao());

        Item pedidoLogado = new PedidoProxy(pizza, true);
        System.out.println(pedidoLogado.descricao());
    }

}
