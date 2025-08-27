package com.estudos.padroes.proj.abstr;

import com.estudos.padroes.proj.Bebida;
import com.estudos.padroes.proj.Pizza;

/**
 * @author maria
 * @date 16/07/2025
 * @description Classe PratoItaliano
 */
public interface ComboItaliano {

    Bebida getBebida();
    Pizza getPizza();
}
