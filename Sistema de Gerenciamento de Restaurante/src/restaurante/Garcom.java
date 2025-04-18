package restaurante;

public class Garcom extends Funcionario {
    public Garcom(String nome) {
        super(nome);
    }

    @Override
    public void executarTarefa() {
        System.out.println(nome + " está anotando um pedido.");
    }
}
