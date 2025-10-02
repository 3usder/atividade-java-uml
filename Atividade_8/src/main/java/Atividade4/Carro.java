package Atividade4;

public class Carro {
    private String nome = "nome";
    private String modelo = "modelo";
    private int velocidade = 0;

    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    public void frear() {
        System.out.println("O carro está freando!");
    }

    public void buzinar() {
        System.out.println("O carro está buzinando!");
    }

    public static void main(String[] args) {
        Atividade4.Carro meuCarro = new Atividade4.Carro();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.buzinar();
    }
}
