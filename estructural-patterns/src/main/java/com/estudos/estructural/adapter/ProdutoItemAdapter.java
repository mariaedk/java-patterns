package com.estudos.estructural.adapter;

import com.estudos.estructural.item.Item;
import com.estudos.estructural.item.Produto;

/**
 * @author maria
 * @date 06/09/2025
 * @description Classe ProdutoItemAdapter
 */
public class ProdutoItemAdapter implements Item {

    private Produto produto;

    public ProdutoItemAdapter(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String descricao() {
        return "";
    }
}
