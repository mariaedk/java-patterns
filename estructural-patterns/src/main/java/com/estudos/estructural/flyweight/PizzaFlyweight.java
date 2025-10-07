package com.estudos.estructural.flyweight;

/**
 * Compartilhar objetos repetidos e assim economizar memória.
 * Em vez de criar mil objetos idênticos, você guarda apenas um e reutiliza.
 *
 * @author maria
 * @date 02/10/2025
 * @description Classe PizzaFlyweight
 */
public class PizzaFlyweight {
    private String sabor;
    private double preco;

    public PizzaFlyweight(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public void servir(String mesa) {
        System.out.println("pizza de " + sabor + " (R$" + preco + ") para a mesa " + mesa);
    }
}
