package com.estudos.estructural.decorator;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 18/09/2025
 * @description Classe AdicionalDecorator
 */
public abstract class AdicionalDecorator implements Item {

    protected Item item;

    public AdicionalDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String descricao() {
        return "";
    }
}
