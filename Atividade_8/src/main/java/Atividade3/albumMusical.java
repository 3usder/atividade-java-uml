package Atividade3;

public class albumMusical {
    private String titulo = "titulo";
    private String ano = "ano";
    private String estilo = "estilo";

    public void reproduzir() {
        System.out.println(titulo + "," + ano + "," + estilo);
    }

    public static void main(String[] args) {
        Atividade3.albumMusical meualbumMusical = new Atividade3.albumMusical();
        meualbumMusical.reproduzir();

    }
}