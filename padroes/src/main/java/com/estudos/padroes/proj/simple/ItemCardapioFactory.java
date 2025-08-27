package com.estudos.padroes.proj.simple;

import com.estudos.padroes.proj.Bebida;
import com.estudos.padroes.proj.ItemCardapio;
import com.estudos.padroes.proj.Pizza;
import com.estudos.padroes.proj.Salada;
import com.estudos.padroes.proj.domain.TipoItem;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe ItemPedidoFactory. Ordem de criação de algum pedido fica encapsulada nesta factory.
 * A factory recebe apenas os parametros necessarios para receber a instancia de algo, estando encapsulada a regra
 * que define qual instancia do que, vai retornar.
 * Essa implementação é mais simples, centraliza numa só factory, seria um "simple factory method".
 * Poderia criar uma factory pora cada item do pedido.
 */
public class ItemCardapioFactory {

    public static ItemCardapio criarItem(TipoItem tipo) {
        if (tipo == null) {
            return null;
        }

        if (TipoItem.PIZZA.equals(tipo)) {
            return new Pizza();
        }

        if (TipoItem.SALADA.equals(tipo)) {
            return new Salada();
        }

        return new Bebida();
    }
}
