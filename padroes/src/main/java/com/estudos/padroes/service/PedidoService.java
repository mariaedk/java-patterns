package com.estudos.padroes.service;

import com.estudos.padroes.factory.ItemCardapio;
import com.estudos.padroes.factory.domain.TipoItem;
import com.estudos.padroes.factory.simple.ItemCardapioFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe PedidoService. Serviço básico de pedidos para consumir a factory de itens de pedido.
 */
public class PedidoService {

    public List<ItemCardapio> montarPedido(List<TipoItem> tipos) {
        List<ItemCardapio> pedido = new ArrayList<>();

        for (TipoItem tipo : tipos) {
            ItemCardapio item = ItemCardapioFactory.criarItem(tipo);
            pedido.add(item);
        }

        return pedido;
    }
}
