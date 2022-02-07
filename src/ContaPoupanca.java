public class ContaPoupanca extends Conta{

    public void imprimirExtrato() {
        System.out.println(
                "\n##############################\n" +
                  "### Extrato Conta Poupanca ###");
        imprimeDadosExtrato();
    }
}