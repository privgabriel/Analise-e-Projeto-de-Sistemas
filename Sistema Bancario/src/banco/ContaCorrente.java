package banco;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite){
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= (saldo + limite)){
            saldo -= valor;
            return true;
        }
        return false;
    }
    @Override
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Corrente " + numero + " | Saldo: R$" + saldo + " | Limite: R$" + limite);
    }
}