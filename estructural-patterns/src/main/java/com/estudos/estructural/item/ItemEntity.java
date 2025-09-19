package com.estudos.estructural.item;

/**
 * @author maria
 * @date 06/09/2025
 * @description Classe ItemEntity
 */
public class ItemEntity implements Item {

    private String descricao;

    @Override
    public String descricao() {
        return descricao;
    }

}
