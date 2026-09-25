import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jogador> listaDeJogadores = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        int opcaoMenu;

        do {
            Menu.menu();

            while(!leitor.hasNextInt()){
                System.out.println("\nDigite uma das opções.");
                Menu.menu();
                leitor.next();
            }
            opcaoMenu = leitor.nextInt();
            leitor.nextLine();

            switch(opcaoMenu) {

                case 1:
                    System.out.println("\n===== CRIANDO PERFIL DE PLAYER =====");
                    System.out.print("Diga seu nickname: ");
                    String nickname = leitor.nextLine();

                    System.out.print("\nDiga seu nome: ");
                    String nome = leitor.nextLine();

                    Menu.posicao();
                    while (!leitor.hasNextInt()) {
                        System.out.println("\nDigite um número dentre as opções: ");
                        Menu.posicao();
                        leitor.next();
                    }
                    int posicao = leitor.nextInt();

                    while (posicao < 1 || posicao > 6) {
                        System.out.println("\nDigite um número dentre as opções: ");
                        Menu.posicao();

                        while (!leitor.hasNextInt()) {
                            System.out.print("\nDigite um número dentre as opções: ");
                            Menu.posicao();
                            leitor.next();
                        }
                        posicao = leitor.nextInt();
                        String posicaoTexto = Menu.obterNomePosicao(posicao);

                    }
                    System.out.print("\nDigite seu número: ");

                    while (!leitor.hasNextInt()) {
                        System.out.println("\nDigite um número positivo ou mais.");
                        leitor.next();
                    }
                    int numero = leitor.nextInt();

                    while (numero <= 0) {
                        System.out.println("\nEscolha um número positivo.");
                        System.out.print("Digite seu número: ");

                        while (!leitor.hasNextInt()) {
                            System.out.println("\nDigite um número positivo ou mais.");
                            leitor.next();
                        }

                        numero = leitor.nextInt();
                    }
                    Jogador jogadorNovo = new Jogador(nickname, nome, posicao, numero);
                    listaDeJogadores.add(jogadorNovo);

                    System.out.println("\nJogador adicionado com sucesso.");

                    break;

                case 2:
                    Jogador.listarJogadores(listaDeJogadores);

                    break;







            }

        } while(opcaoMenu !=0);
        System.out.println("\nSaindo do sistema...");

    }
}
