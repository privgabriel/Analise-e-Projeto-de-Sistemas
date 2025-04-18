package banco;

import java.util.List;

public class CaixaEletronico {
    private String localizacao;
    private List<ContaBancaria> contasAssociadas;

    public CaixaEletronico(String localizacao, List<ContaBancaria> contasAssociadas){
        this.localizacao = localizacao;
        this.contasAssociadas = contasAssociadas;
    }

    public void sacar(String numeroConta, double valor){
        for (ContaBancaria conta : contasAssociadas){
            if (conta.getNumero().equals(numeroConta)){
                if (conta.sacar(valor)) {
                    System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
                } else {
                    System.out.println("Saldo insuficiente na conta " + numeroConta);
                }
                return;
            }
        }
        System.out.println("Conta não encontrada no caixa eletrônico.");
    }
}
