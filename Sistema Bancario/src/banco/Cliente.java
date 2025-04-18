package banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<ContaBancaria> contas;

    public Cliente(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public List<ContaBancaria> getContas(){
        return contas;
    }

    public String getNome(){
        return nome;
    }
}