package com.estudos.estructural.adapter;

import com.estudos.estructural.item.Item;
import com.estudos.estructural.item.Produto;
import com.estudos.estructural.item.ProdutoEntity;

/**
 * @author maria
 * @date 06/09/2025
 * @description Classe AdapterMain
 */
public class AdapterMain {

    public static void main(String[] args) {
        Produto produto = new ProdutoEntity("Manteiga");

        // adaptar para nova interface.
        Item itemNovo = new ProdutoItemAdapter(produto);

        System.out.println("Item: " + itemNovo);
    }
}
