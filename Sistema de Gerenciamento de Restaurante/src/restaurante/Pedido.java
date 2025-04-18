package restaurante;

import java.util.List;

public class Pedido {
    private Mesa mesa;
    private Garcom garcom;
    private List<ItemDePedido> itens;

    public Pedido(Mesa mesa, Garcom garcom, List<ItemDePedido> itens) {
        this.mesa = mesa;
        this.garcom = garcom;
        this.itens = itens;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemDePedido::getSubtotal).sum();
    }
}
