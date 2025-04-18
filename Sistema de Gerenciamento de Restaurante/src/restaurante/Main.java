package restaurante;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(5);
        Garcom garcom = new Garcom("Carlos");

        ItemDePedido item1 = new ItemDePedido("Pizza", 2, 40.0);
        ItemDePedido item2 = new ItemDePedido("Refrigerante", 1, 7.0);

        Pedido pedido = new Pedido(mesa1, garcom, Arrays.asList(item1, item2));

        double total = pedido.calcularTotal();
        System.out.println("Total do pedido: R$" + total);

        Pagamento pagamento = new Pagamento(total);
        pagamento.realizarPagamento();
    }
}
