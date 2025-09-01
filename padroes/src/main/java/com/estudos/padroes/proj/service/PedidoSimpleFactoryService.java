package com.estudos.padroes.proj.service;

import com.estudos.padroes.proj.ItemCardapio;
import com.estudos.padroes.proj.domain.TipoItem;
import com.estudos.padroes.proj.simple.ItemCardapioFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe PedidoService. Serviço básico de pedidos para consumir a factory de itens de pedido.
 */
public class PedidoSimpleFactoryService {

    public List<ItemCardapio> montarPedido(List<TipoItem> tipos) {
        List<ItemCardapio> pedido = new ArrayList<>();

        for (TipoItem tipo : tipos) {
            ItemCardapio item = ItemCardapioFactory.criarItem(tipo);
            pedido.add(item);
        }

        return pedido;
    }
}
