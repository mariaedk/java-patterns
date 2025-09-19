package com.estudos.estructural.decorator;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 18/09/2025
 * @description Classe QueijoExtra
 */
public class QueijoExtra extends AdicionalDecorator {

    public QueijoExtra(Item item) {
        super(item);
    }

    @Override
    public String descricao() {
        return item.descricao() + " + queijo extra";
    }
}
