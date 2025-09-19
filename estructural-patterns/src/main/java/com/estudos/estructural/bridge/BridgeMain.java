package com.estudos.estructural.bridge;

import java.util.List;

/**
 * @author maria
 * @date 08/09/2025
 * @description Classe BridgeMain
 */
public class BridgeMain {

    public static void main(String[] args) {
        List<String> itens = List.of("Pizza", "Salada", "Bebida");

        GeradorRelatorio geradorPDF = new GeradorRelatorioPDF();
        GeradorRelatorio geradorHTML = new GeradorRelatorioHTML();

        Relatorio relatorio1 = new RelatorioCardapio(geradorPDF, itens);
        relatorio1.gerar();

        Relatorio relatorio2 = new RelatorioCardapio(geradorHTML, itens);
        relatorio2.gerar();
    }

}
