package com.estudos.padroes.proj.abstr;

import com.estudos.padroes.proj.Bebida;
import com.estudos.padroes.proj.Pizza;
import com.estudos.padroes.proj.builder.PizzaBuilder;

/**
 * @author maria
 * @date 16/07/2025
 * @description Classe ComboFitNormal
 */
public class ComboNormal implements ComboItaliano {

    @Override
    public Bebida getBebida() {
        return new Bebida("Guaraná", 7.50);
    }

    @Override
    public Pizza getPizza() {
        return PizzaBuilder.newInstance().withSabor1("queijo").withSabor2("portuguesa").withExtraQueijo(true).build();
    }
}
