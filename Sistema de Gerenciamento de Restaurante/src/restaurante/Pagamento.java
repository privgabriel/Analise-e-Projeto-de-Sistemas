package restaurante;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");
    }
}
