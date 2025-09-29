package com.estudos.estructural.facade;

import com.estudos.estructural.item.Item;

/**
 * @author maria
 * @date 29/09/2025
 * @description Classe PedidoFacade
 */
public class PedidoFacade {

    private PagamentoService pagamentoService;
    private EntregaService entregaService;

    public PedidoFacade() {
        this.pagamentoService = new PagamentoService();
        this.entregaService = new EntregaService();
    }

    public void realizarPedido(Item item, String endereco) {
        System.out.println("Pedido: " + item.descricao());
        entregaService.agendarEntrega(endereco);
        System.out.println("Pedido concluído!");
    }

}
