package banco;

public abstract class ContaBancaria {
    protected String numero;
    protected double saldo;
    protected double taxaRendimento;
    protected Cliente cliente;

    public ContaBancaria(String numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void aplicarRendimento() {
        saldo += (saldo * taxaRendimento);
    }


    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public abstract void exibirInformacoes();
}