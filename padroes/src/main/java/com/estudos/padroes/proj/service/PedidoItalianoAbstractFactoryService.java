package com.estudos.padroes.proj.service;

import com.estudos.padroes.proj.abstr.ComboFitItaliano;
import com.estudos.padroes.proj.abstr.ComboItaliano;
import com.estudos.padroes.proj.abstr.ComboNormal;
import com.estudos.padroes.proj.domain.TipoCardapio;

/**
 * @author maria
 * @date 16/07/2025
 * @description Classe PedidoAbstractFactoryService
 */
public class PedidoItalianoAbstractFactoryService {

    public ComboItaliano montarPedido(TipoCardapio tipoCardapio) {

        switch (tipoCardapio) {
            case FIT -> {
                return new ComboNormal();
            }
            case NORMAL -> {
                return new ComboFitItaliano();
            }
            default -> {
                return null;
            }
        }
    }
}
