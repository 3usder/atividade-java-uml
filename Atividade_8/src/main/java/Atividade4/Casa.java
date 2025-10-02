package Atividade4;

public class Casa {
    private String cor = "cor";
    private int qtdQuartos = 0;
    private String endereco = "endereco";

    public void abrirPorta() {
        System.out.println("A porta da casa foi aberta!");
    }

    public void acenderLuz() {
        System.out.println("A luz da casa foi acesa!");
    }

    public void receberVisita() {
        System.out.println("A casa está recebendo uma visita!");
    }

    public static void main(String[] args) {
        Atividade4.Casa c = new Atividade4.Casa();
        c.abrirPorta();
        c.acenderLuz();
        c.receberVisita();
    }
}
