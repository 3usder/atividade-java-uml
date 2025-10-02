package Atividade5;

public class Pessoa {
    private String nome = "nome";
    private int idade = 0;
    private String estadoEmocional = "estadoEmocional";

    public void procurarPeca() {
        System.out.println("A pessoa está procurando a peça!");
    }

    public void refletir() {
        System.out.println("A pessoa está refletindo!");
    }

    public void compartilharSentimentos() {
        System.out.println("A pessoa está compartilhando sentimentos!");
    }

    public static void main(String[] args) {
        Atividade5.Pessoa p = new Atividade5.Pessoa();
        p.procurarPeca();
        p.refletir();
        p.compartilharSentimentos();
    }
}