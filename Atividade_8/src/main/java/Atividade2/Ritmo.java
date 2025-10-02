package Atividade2;

public class Ritmo {
    private String balanco = "balanco";
    private String ensaiado =  "ensaiado";
    private String embalo =  "embalo";
    public void devagar() {

        System.out.println(balanco + "," + ensaiado + "," + embalo);
    }
    public static void main(String[] args) {
        Ritmo meuRitmo = new Ritmo();
        meuRitmo.devagar();
    }
}
