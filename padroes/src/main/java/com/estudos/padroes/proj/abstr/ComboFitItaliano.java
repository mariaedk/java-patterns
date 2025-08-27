package com.estudos.padroes.proj.abstr;

import com.estudos.padroes.proj.Bebida;
import com.estudos.padroes.proj.Pizza;

/**
 * @author maria
 * @date 16/07/2025
 * @description Classe ComboFitItaliano
 */
public class ComboFitItaliano implements ComboItaliano {

    @Override
    public Bebida getBebida() {
        return new Bebida("Coca zero", 8);
    }

    @Override
    public Pizza getPizza() {
        return new Pizza("Brócolis", 30);
    }
}
