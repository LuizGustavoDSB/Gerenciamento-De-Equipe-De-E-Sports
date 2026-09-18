import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {

    private String nickname;
    String nome;
    String posicao;
    int numero;

    public Jogador(String nickname, String nome, String posicao, int numero) {
        this.nickname = nickname;
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nickname='" + nickname + '\'' +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numero=" + numero +
                '}';
    }
}
