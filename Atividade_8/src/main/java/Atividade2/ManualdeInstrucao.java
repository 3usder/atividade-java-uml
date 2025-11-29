package Atividade2;

public class ManualdeInstrucao {
    private int id;
    private String sonhos;
    private String gostos;
    private String pensamentos;

    public ManualdeInstrucao() {}

    public ManualdeInstrucao(String sonhos, String gostos, String pensamentos) {
        this.sonhos = sonhos;
        this.gostos = gostos;
        this.pensamentos = pensamentos;
    }

    public ManualdeInstrucao(int id, String sonhos, String gostos, String pensamentos) {
        this.id = id;
        this.sonhos = sonhos;
        this.gostos = gostos;
        this.pensamentos = pensamentos;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSonhos() { return sonhos; }
    public void setSonhos(String sonhos) { this.sonhos = sonhos; }
    public String getGostos() { return gostos; }
    public void setGostos(String gostos) { this.gostos = gostos; }
    public String getPensamentos() { return pensamentos; }
    public void setPensamentos(String pensamentos) { this.pensamentos = pensamentos; }

    public void conversar() {
        System.out.println(sonhos + "," + gostos + "," + pensamentos);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Sonhos: " + sonhos + " | Gostos: " + gostos + " | Pensamentos: " + pensamentos;
    }
}