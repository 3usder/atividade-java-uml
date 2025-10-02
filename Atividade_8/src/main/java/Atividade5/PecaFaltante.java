package Atividade5;

public class PecaFaltante {
    private String formato = "formato";
    private int tamanho = 0;
    private String simbolismo = "simbolismo";

    public void encaixar() {
        System.out.println("A peça faltante está encaixando!");
    }

    public void sePerder() {
        System.out.println("A peça faltante se perdeu!");
    }

    public void seTransformar() {
        System.out.println("A peça faltante está se transformando!");
    }

    public static void main(String[] args) {
        PecaFaltante pf = new PecaFaltante();
        pf.encaixar();
        pf.sePerder();
        pf.seTransformar();
    }
}
