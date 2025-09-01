package com.estudos.padroes;

import com.estudos.padroes.proj.Pizza;

/**
 * @author maria
 * @date 01/09/2025
 * @description Classe Main
 */
public class Main {

    public static void main(String[] args) {
        Pizza modeloPizza = new Pizza("Calabresa");
        modeloPizza.setBordaRecheada(false);
        modeloPizza.setPreco(43);
        modeloPizza.setTamanho("Grande");

        Pizza p1 = modeloPizza.clone();
        p1.setSabor1("Calabresa com queijo");

    }
}
