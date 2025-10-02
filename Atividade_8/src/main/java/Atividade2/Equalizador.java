package Atividade2;

public class Equalizador {
    private String cheiro;
    private String solta;
    private String instrucao;

    public Equalizador(String cheiro, String solta, String instrucao) {
        this.cheiro = cheiro;
        this.solta = solta;
        this.instrucao = instrucao;
    }

    public void conversar() {
        System.out.println("Cheiro: " + cheiro + ", Solta: " + solta + ", Instrução: " + instrucao);
    }

    public String getSonhos() { return cheiro; }
    public String getGostos() { return solta; }
    public String getPensamentos() { return instrucao; }
}