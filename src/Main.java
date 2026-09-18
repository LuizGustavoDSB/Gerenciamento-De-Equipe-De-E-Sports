import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jogador> listaDeJogadores = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        int opcaoMenu;

        do {
            Menu.menu();
            opcaoMenu = leitor.nextInt();

            for(Jogador jogadores : listaDeJogadores){
                System.out.println(jogadores);
            }

            switch(opcaoMenu) {

                case 1:
                    System.out.print("Diga seu nickanme: ");
                    String nickname = leitor.next();

                    System.out.println("Diga seu nome: ");
                    String nome = leitor.next();

                    System.out.println("Digite sua posição: ");
                    String posicao = leitor.next();

                    System.out.println("Digite seu número:");
                    int numero = leitor.nextInt();

                    Jogador jogadorNovo = new Jogador (nickname, nome, posicao, numero);
                    listaDeJogadores.add(jogadorNovo);




            }

        } while(opcaoMenu !=0);
        System.out.println("Saindo do sistema.");

    }
}