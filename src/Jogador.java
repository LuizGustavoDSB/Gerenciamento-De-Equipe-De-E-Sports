import java.util.ArrayList;

public class Jogador {

        private String nickname;
        private String nome;
        private int posicao;
        private int numero;

        public Jogador(String nickname, String nome, int posicao, int numero) {
            this.nickname = nickname;
            this.nome = nome;
            this.posicao = posicao;
            this.numero = numero;
        }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nNickname: " + nickname
               + "\nNome: " + nome
               + "\nPosição: " + Menu.obterNomePosicao(posicao)
               + "\nNúmero: " + numero + "\n";
    }

            public static void listarJogadores(ArrayList<Jogador> jogadores) {

                if (jogadores.size() == 0) {

                    System.out.println("\nNão existem jogadores.");

                } else if (jogadores.size() == 1) {

                    System.out.println("\nListando jogador:");

                    int contador = 1;

                    System.out.print("\nJogador [" + contador + "]:");
                    System.out.println(jogadores.get(0));

                    contador++;
                } else {

                    System.out.println("\nListando jogadores:");

                    int contador = 1;

                    for (Jogador jogador : jogadores) {

                        System.out.print("\nJogador [" + contador + "]:");
                        System.out.print(jogador + "\n");

                        contador++;
                    }
                }
            }
}
