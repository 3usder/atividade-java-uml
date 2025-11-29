package Atividade2;

public class Ritmo {
    private int id;
    private String balanco;
    private String ensaiado;
    private String embalo;

    public Ritmo() {}

    public Ritmo(String balanco, String ensaiado, String embalo) {
        this.balanco = balanco;
        this.ensaiado = ensaiado;
        this.embalo = embalo;
    }

    public Ritmo(int id, String balanco, String ensaiado, String embalo) {
        this.id = id;
        this.balanco = balanco;
        this.ensaiado = ensaiado;
        this.embalo = embalo;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getBalanco() { return balanco; }
    public void setBalanco(String balanco) { this.balanco = balanco; }
    public String getEnsaiado() { return ensaiado; }
    public void setEnsaiado(String ensaiado) { this.ensaiado = ensaiado; }
    public String getEmbalo() { return embalo; }
    public void setEmbalo(String embalo) { this.embalo = embalo; }

    public void devagar() {
        System.out.println(balanco + "," + ensaiado + "," + embalo);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Balanço: " + balanco + " | Ensaiado: " + ensaiado + " | Embalo: " + embalo;
    }
}