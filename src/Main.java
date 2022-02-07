import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        UI ui = new UI();

        ui.banner();
        ui.menuPricipal();

        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();
        int op = sc.nextInt();

        while (op != 4){
            if (op == 1) {
                if (clientes.isEmpty()) {
                    System.out.println("\nNão há clientes cadastrado.");
                    System.out.println("* 1 - Cadastrar novo cliente\n* 2 - Retornar ao menu principal\n");
                    int aux = sc.nextInt();
                    if (aux == 1) {
                        System.out.print("Nome do cliente: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println("Tipo de conta:\n** 1 - Conta Corrente\n** 2 - Conta Poupança");
                        int aux2 = sc.nextInt();
                        if (aux2 == 1) {
                            Conta cc = new ContaCorrente();
                            clientes.add(new Cliente(nome, cc));
                            contas.add(cc);
                            ui.msgSucessoCadastroCliente();
                        } else if (aux2 == 2) {
                            Conta cp = new ContaPoupanca();
                            clientes.add(new Cliente(nome, cp));
                            contas.add(cp);
                            ui.msgSucessoCadastroCliente();
                        }
                    } else if (aux == 2){
                        ui.menuPricipal();
                        op = sc.nextInt();
                    }
                } else {
                    System.out.println("\nCLIENTES:\n");
                    for (Cliente cliente : clientes) {
                        System.out.println("\n" + cliente);
                    }
                    System.out.println();
                }
            } else if (op == 2){
                System.out.print("Nome do cliente: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Tipo de conta:\n** 1 - Conta Corrente\n** 2 - Conta Poupança");
                int aux2 = sc.nextInt();
                if (aux2 == 1) {
                    Conta cc = new ContaCorrente();
                    clientes.add(new Cliente(nome, cc));
                    contas.add(cc);
                    ui.msgSucessoCadastroCliente();
                } else if (aux2 == 2) {
                    Conta cp = new ContaPoupanca();
                    clientes.add(new Cliente(nome, cp));
                    contas.add(cp);
                    ui.msgSucessoCadastroCliente();
                }
            } else if (op == 3) {
                for (Conta c : contas) {
                    System.out.println(c);
                }
            } else if (op < 1 || op > 4) {
                System.out.println("Opção invalida!!!\n\nEscolha um numero entre 1 e 4\n\n");
            }
            ui.menuPricipal();
            op = sc.nextInt();
        }


        sc.close();
    }
}
