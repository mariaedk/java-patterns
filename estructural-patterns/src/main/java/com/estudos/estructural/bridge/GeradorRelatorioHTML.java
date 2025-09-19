package com.estudos.estructural.bridge;

/**
 * @author maria
 * @date 08/09/2025
 * @description Classe GeradorRelatorioHTML
 */
public class GeradorRelatorioHTML implements GeradorRelatorio {

    @Override
    public void gerar(String conteudo) {
        System.out.println("<html><body>" + conteudo + "</body></html>");
    }

}
