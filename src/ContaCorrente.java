public class ContaCorrente extends Conta{

    public void imprimirExtrato() {
        System.out.println(
                "\n##############################\n" +
                  "### Extrato Conta Corrente ###");
        imprimeDadosExtrato();
    }
}
