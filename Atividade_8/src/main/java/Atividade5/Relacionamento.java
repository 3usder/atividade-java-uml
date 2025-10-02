package Atividade5;

public class Relacionamento {
    private String tipo = "tipo";
    private int duracao = 0;
    private String intensidade = "intensidade";

    public void iniciar() {
        System.out.println("O relacionamento começou!");
    }

    public void terminar() {
        System.out.println("O relacionamento terminou!");
    }

    public void fortalecer() {
        System.out.println("O relacionamento está se fortalecendo!");
    }

    public static void main(String[] args) {
        Atividade5.Relacionamento r = new Atividade5.Relacionamento();
        r.iniciar();
        r.terminar();
        r.fortalecer();
    }
}
