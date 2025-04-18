package restaurante;

import java.util.List;

public class Cardapio {
    private List<String> itensDisponiveis;

    public Cardapio(List<String> itensDisponiveis) {
        this.itensDisponiveis = itensDisponiveis;
    }

    public void exibirCardapio() {
        System.out.println("Itens disponíveis:");
        for (String item : itensDisponiveis) {
            System.out.println("- " + item);
        }
    }
}
