package com.estudos.estructural.flyweight;

/**
 * @author maria
 * @date 06/10/2025
 * @description Classe FlyweightMain
 */
public class FlyweightMain {

    public static void main(String[] args) {
        PizzaFlyweight p1 = PizzaFactory.getPizza("Calabresa");
        PizzaFlyweight p2 = PizzaFactory.getPizza("Mussarela");
        // reaproveitar a primeira
        PizzaFlyweight p3 = PizzaFactory.getPizza("Calabresa");

        p1.servir("Mesa 1");
        p2.servir("Mesa 2");
        p3.servir("Mesa 3");

        System.out.println("Objeto 1 " + p1.toString());
        System.out.println("Objeto 2 " + p2.toString());
        System.out.println("Objeto 3 " + p3.toString()); // tem a mesma referencia do primeiro
    }
}
