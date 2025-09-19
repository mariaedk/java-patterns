package com.estudos.estructural.bridge;

/**
 * @author maria
 * @date 08/09/2025
 * @description Classe GeradorRelatorioPDF
 */
public class GeradorRelatorioPDF implements GeradorRelatorio {

    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando PDF com: " + conteudo);
    }

}
