package banco;

import java.util.List;

public class Agencia {
    private String codigo;
    private List<ContaBancaria> contas;

    public Agencia(String codigo, List<ContaBancaria> contas){
        this.codigo = codigo;
        this.contas = contas;
    }

    public void listarContas(){
        System.out.println("Contas na agência " + codigo + ":");
        for (ContaBancaria conta : contas) {
            conta.exibirInformacoes();
        }
    }
}