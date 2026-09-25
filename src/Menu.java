public class Menu {
    public static void menu() {

        System.out.print("\n===== E-SPORTS MANAGER =====\n"
                + "[1] - Cadastrar jogador;\n"
                + "[2] - Listar jogadores;\n"
                + "[3] - Remover jogador;\n"
                + "[4] - Registrar partida;\n"
                + "[5] - Listar partidas;\n"
                + "[6] - Consultar jogador;\n"
                + "[7] - Exibir informações da equipe;\n"
                + "[0] - Sair.\n"
                + "Escolha uma opção: ");

    }

    public static void posicao() {
        System.out.print("\nPosições possíveis: \n"
                + "[1] - Entry Fragger;\n"
                + "[2] - AWPer (Sniper);\n"
                + "[3] - In-game Leader (IGL);\n"
                + "[4] - Suporte;\n"
                + "[5] - Lurker;\n"
                + "[6] - Âncora.\n" +
                "\nDigite sua posição: ");

    }

    public static String obterNomePosicao(int escolhaPosicao) {
        switch (escolhaPosicao) {
            case 1:
                return "Entry Fragger";
            case 2:
                return "AWPer (Sniper)";
            case 3:
                return "In-game Leader (IGL)";
            case 4:
                return "Suporte";
            case 5:
                return "Lurker";
            case 6:
                return "Âncora";
            default:
                return "Posição Inválida, tente novamente.";
        }

    }
}
