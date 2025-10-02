package Atividade2;

public class ManualdeInstrucao {
    private String sonhos = "sonhos";
    private String gostos = "gostos";
    private String pensamentos = "pensamentos";

    public void conversar() {
        System.out.println(sonhos + "," + gostos + "," + pensamentos);
    }

    public static void main(String[] args) {
        ManualdeInstrucao meuManualdeInstrucao = new ManualdeInstrucao();
        meuManualdeInstrucao.conversar();

    }
}