package restaurante;

public class ItemDePedido {
    private String nomeItem;
    private int quantidade;
    private double precoUnitario;

    public ItemDePedido(String nomeItem, int quantidade, double precoUnitario) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }
}
