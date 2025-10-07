package com.estudos.estructural.proxy;

import com.estudos.estructural.item.Item;

/**
 * apenas usuarios autenticados podem visualizar detalhes de um pedido.
 * mas quem faz o pedido, pode ser anonimo.
 *
 * @author maria
 * @date 07/10/2025
 * @description Classe PedidoProxy
 */
public class PedidoProxy implements Item {

    private Item itemPedido;
    private boolean usuarioLogado;

    public PedidoProxy(Item pedidoReal, boolean usuarioLogado) {
        this.itemPedido = pedidoReal;
        this.usuarioLogado = usuarioLogado;
    }

    @Override
    public String descricao() {
        if (!usuarioLogado) {
            return "Acesso negado: usuário não autenticado.";
        }
        return itemPedido.descricao();
    }

    public String getPreco() {
        return " reais.";
    }

}
