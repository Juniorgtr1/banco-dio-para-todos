import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private Conta conta;

    private List<Cliente> clientes = new ArrayList<>();

    public Cliente(){}

    public Cliente(String nome, Conta conta){
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nConta: " + conta;
    }
}
