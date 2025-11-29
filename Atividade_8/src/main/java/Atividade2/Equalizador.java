package Atividade2;

public class Equalizador {
    private int id;
    private String cheiro;
    private String solta;
    private String instrucao;

    public Equalizador() {}

    public Equalizador(String cheiro, String solta, String instrucao) {
        this.cheiro = cheiro;
        this.solta = solta;
        this.instrucao = instrucao;
    }

    public Equalizador(int id, String cheiro, String solta, String instrucao) {
        this.id = id;
        this.cheiro = cheiro;
        this.solta = solta;
        this.instrucao = instrucao;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCheiro() { return cheiro; }
    public void setCheiro(String cheiro) { this.cheiro = cheiro; }
    public String getSolta() { return solta; }
    public void setSolta(String solta) { this.solta = solta; }
    public String getInstrucao() { return instrucao; }
    public void setInstrucao(String instrucao) { this.instrucao = instrucao; }

    public void transportar() {
        System.out.println(cheiro + "," + solta + "," + instrucao);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Cheiro: " + cheiro + " | Solta: " + solta + " | Instrução: " + instrucao;
    }
}