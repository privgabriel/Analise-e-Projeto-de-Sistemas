package banco;

public class ContaPoupanca extends ContaBancaria {
    private double rendimentoMensal;

    public ContaPoupanca(String numero, Cliente cliente, double rendimentoMensal) {
        super(numero, cliente);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimentoMensal(){
        saldo += (saldo * rendimentoMensal);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Poupança " + numero + " | Saldo: R$" + saldo + " | Rendimento: " + (rendimentoMensal * 100) + "%");
    }
}
