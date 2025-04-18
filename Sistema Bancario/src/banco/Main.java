package banco;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente("Gabriel");

        ContaCorrente cc = new ContaCorrente("001", gabriel, 500);
        ContaPoupanca cp = new ContaPoupanca("002", gabriel, 0.02);


        gabriel.adicionarConta(cc);
        gabriel.adicionarConta(cp);

        cc.depositar(1000);
        cp.depositar(2000);
        cp.aplicarRendimento();

        Agencia agencia = new Agencia("AG-01", Arrays.asList(cc, cp));
        agencia.listarContas();

        CaixaEletronico caixa = new CaixaEletronico("Centro", Arrays.asList(cc, cp));
        caixa.sacar("001", 1200);
        caixa.sacar("002", 2500);
    }
}
