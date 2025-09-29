package com.estudos.estructural.facade;

import com.estudos.estructural.decorator.Pizza;
import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 29/09/2025
 * @description Classe FacadeMain
 */
public class FacadeMain {

    public static void main(String[] args) {
        Item pizza = new Pizza("Calabresa");

        PedidoFacade facade = new PedidoFacade();
        facade.realizarPedido(pizza, "Rua das Flores, 123");
    }

}
