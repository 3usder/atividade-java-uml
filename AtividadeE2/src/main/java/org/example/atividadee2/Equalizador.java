package org.example.atividadee2;

public class Equalizador {
    private String cheiro;
    private String solta;
    private String instrucao;

    public Equalizador(String cheiro, String solta, String instrucao) {
        this.cheiro = cheiro;
        this.solta = solta;
        this.instrucao = instrucao;
    }

    public void transportar() {
        System.out.println(cheiro + "," + solta + "," + instrucao);
    }

    public String getCheiro() { return cheiro; }
    public String getSolta() { return solta; }
    public String getInstrucao() { return instrucao; }
}