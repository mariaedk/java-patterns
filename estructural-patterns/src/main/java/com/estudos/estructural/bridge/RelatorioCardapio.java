package com.estudos.estructural.bridge;

import java.util.List;

/**
 * @author maria
 * @date 08/09/2025
 * @description Classe RelatorioCardapio
 */
public class RelatorioCardapio extends Relatorio {

    private List<String> itens;

    public RelatorioCardapio(GeradorRelatorio gerador, List<String> itens) {
        super(gerador);
        this.itens = itens;
    }

    @Override
    public void gerar() {
        String conteudo = String.join(", ", itens);
        gerador.gerar("Itens do cardápio: " + conteudo);
    }

}
