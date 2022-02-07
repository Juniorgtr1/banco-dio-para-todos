public class UI {

    public void menuPricipal() {
        System.out.println(
                "MENU\n" +
                "1 - Listar Clientes\n" +
                "2 - Novo Cliente\n" +
                "3 - Listar Contas\n" +
                "4 - Sair\n"
        );
    }

    public void banner() {
        System.out.println(
            "\n______                        ______ _        ______                 _____         _           \n" +
            "| ___ \\                       |  _  (_)       | ___ \\               |_   _|       | |          \n" +
            "| |_/ / __ _ _ __   ___ ___   | | | |_  ___   | |_/ /_ _ _ __ __ _    | | ___   __| | ___  ___ \n" +
            "| ___ \\/ _` | '_ \\ / __/ _ \\  | | | | |/ _ \\  |  __/ _` | '__/ _` |   | |/ _ \\ / _` |/ _ \\/ __|\n" +
            "| |_/ / (_| | | | | (_| (_) | | |/ /| | (_) | | | | (_| | | | (_| |   | | (_) | (_| | (_) \\__ \\" + "\n" +
            "\\____/ \\__,_|_| |_|\\___\\___/  |___/ |_|\\___/  \\_|  \\__,_|_|  \\__,_|   \\_/\\___/ \\__,_|\\___/|___/\n" +
            "\n"
            );
    }

    public void msgSucessoCadastroCliente() {
        System.out.println(
                "\n####################################" +
               "\n# CLIENTE CADASTRADO COM SUCESSO ! #" +
               "\n####################################\n");
    }
}
