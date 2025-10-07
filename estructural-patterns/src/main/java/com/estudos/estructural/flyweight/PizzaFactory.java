package com.estudos.estructural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maria
 * @date 02/10/2025
 * @description Classe PizzaFactory
 */
public class PizzaFactory {

    private static Map<String, PizzaFlyweight> cache = new HashMap<>();

    public static PizzaFlyweight getPizza(String sabor) {
        if (!cache.containsKey(sabor)) {
            double preco = switch (sabor) {
                case "Calabresa" -> 30.0;
                case "Mussarela" -> 28.0;
                case "Portuguesa" -> 32.0;
                default -> 25.0;
            };
            cache.put(sabor, new PizzaFlyweight(sabor, preco));
        }
        return cache.get(sabor);
    }

}
