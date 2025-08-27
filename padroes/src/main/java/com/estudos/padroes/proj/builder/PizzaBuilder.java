package com.estudos.padroes.proj.builder;

import com.estudos.padroes.proj.Pizza;

/**
 * @author maria
 * @date 27/08/2025
 * @description Classe PizzaBuilder
 */
public class PizzaBuilder {

    String sabor1;
    String sabor2;
    String sabor3;
    String sabor4;
    String tamanho;
    boolean bordaRecheada;
    boolean extraQueijo;
    String descricao;
    double preco;

    private PizzaBuilder() {

    }

    public static PizzaBuilder newInstance() {
        return new PizzaBuilder();
    }

    public PizzaBuilder withSabor1(String sabor1) {
        this.sabor1 = sabor1;
        return this;
    }

    public PizzaBuilder withSabor2(String sabor2) {
        this.sabor2 = sabor2;
        return this;
    }

    public PizzaBuilder withSabor3(String sabor3) {
        this.sabor3 = sabor3;
        return this;
    }

    public PizzaBuilder withSabor4(String sabor4) {
        this.sabor4 = sabor4;
        return this;
    }

    public PizzaBuilder withTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder withBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
        return this;
    }

    public PizzaBuilder withExtraQueijo(boolean extraQueijo) {
        this.extraQueijo = extraQueijo;
        return this;
    }

    public Pizza build() {
        return new Pizza(this.sabor1, this.sabor2, this.sabor3, this.sabor4, this.tamanho, this.bordaRecheada,
                this.extraQueijo, this.descricao, this.preco);
    }
}
