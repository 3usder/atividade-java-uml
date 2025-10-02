package Atividade4;

public class Pessoa {
    private String nome = "nome";
    private int idade = 0;
    private String humor = "humor";

    public void falar() {
        System.out.println("A pessoa está falando!");
    }

    public void andar() {
        System.out.println("A pessoa está andando!");
    }

    public void nadar() {
        System.out.println("A pessoa está nadando!");
    }

    public static void main(String[] args) {
        Atividade4.Pessoa p = new Atividade4.Pessoa();
        p.falar();
        p.andar();
        p.nadar();
    }
}
