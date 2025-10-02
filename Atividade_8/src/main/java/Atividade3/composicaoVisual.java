package Atividade3;

public class composicaoVisual {
    private String paletaCores = "paletaCores";
    private String simetria = "simetria";
    private String elementoTribal = "elementoTribal";

    public void harmonizar() {
        System.out.println(paletaCores + "," + simetria + "," + elementoTribal);
    }

    public static void main(String[] args) {
        Atividade3.composicaoVisual meucomposicaoVisual = new Atividade3.composicaoVisual();
        meucomposicaoVisual.harmonizar();

    }
}
