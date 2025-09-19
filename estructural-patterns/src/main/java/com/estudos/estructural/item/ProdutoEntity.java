package com.estudos.estructural.item;

/**
 * @author maria
 * @date 06/09/2025
 * @description Classe Produto
 */
public class ProdutoEntity implements Produto {

    private String nome;

    public ProdutoEntity(String nome) {
        this.nome = nome;
    }

    @Override
    public String detalhes() {
        return "Produto: " + this.nome;
    }
}
