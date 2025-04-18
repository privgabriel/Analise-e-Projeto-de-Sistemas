package restaurante;

public class Cozinheiro extends Funcionario {
    public Cozinheiro(String nome) {
        super(nome);
    }

    @Override
    public void executarTarefa() {
        System.out.println(nome + " está preparando o pedido.");
    }
}
