package com.estudos.estructural.bridge;

/**
 * @author maria
 * @date 08/09/2025
 * @description Classe Relatorio
 */
public abstract class Relatorio {

    protected GeradorRelatorio gerador;

    public Relatorio(GeradorRelatorio gerador) {
        this.gerador = gerador;
    }

    public abstract void gerar();

}
