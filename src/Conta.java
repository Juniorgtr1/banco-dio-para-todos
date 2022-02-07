public abstract class Conta{

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agencia = AGENCIA_PADRAO;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimeDadosExtrato(){
        System.out.println(String.format("# Agencia: %d", this.agencia));
        System.out.println(String.format("# Numero: %d", this.numero));
        System.out.println(String.format("# Saldo: %.2f", this.saldo));
        System.out.println("##############################\n");
    }

    public void sacar(double valor) {
        if (saldo <= 0 || saldo < valor){
            System.out.println(
                    "\n##################################\n" +
                      "# Saldo suficiente para o saque! #\n" +
                      "##################################\n");
        } else {
            saldo -= valor;
            System.out.println(
                    "\n################################\n" +
                      "# Saque realizado com sucesso! #\n" +
                      "################################\n");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println(
                    "\n#################################\n" +
                      "# Operação não Realizada!       #\n" +
                      "# Valor informado não é válido. #\n" +
                      "# Operação encerrada!           #\n" +
                      "#################################\n");
        }else {
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino == null){
            System.out.println(
                  "\n#############################################\n" +
                    "# Conta de destino inexistente!             #\n" +
                    "# Favor insira uma conta de destino válida! #\n" +
                    "#############################################\n");
        } else if (this.saldo < valor){
            System.out.println(
                  "\n########################################" +
                    "# Saldo insuficiente para a transação! #\n" +
                    "# Verifique o saldo e tente novamente. #\n" +
                    "########################################\n");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Agencia: " + agencia +
                "\nNumero: " + numero +
                "\nSaldo: " + saldo;
    }
}
