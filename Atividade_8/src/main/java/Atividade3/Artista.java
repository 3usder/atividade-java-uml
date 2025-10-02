package Atividade3;

public class Artista {
    private String nome = "nome";
    private String expressao = "expressao";
    private String posicao = "posicao";

    public void cantar() {
        System.out.println(nome + "," + expressao + "," + posicao);
    }

    public static void main(String[] args) {
        Atividade3.Artista meuArtista = new Atividade3.Artista();
        meuArtista.cantar();

    }
}
