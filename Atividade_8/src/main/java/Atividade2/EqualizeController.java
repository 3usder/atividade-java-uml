package Atividade2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;

public class EqualizeController {
    // ABA 1
    @FXML private TextField txtfieldSonhos;
    @FXML private TextField txtfieldGostos;
    @FXML private TextField txtfieldPensamentos;

    // ABA 2
    @FXML private TextField txtfieldCheiro;
    @FXML private TextField txtfieldSolta;
    @FXML private TextField txtfieldDistracao;

    // ABA 3
    @FXML private TextField txtfieldBalanco;
    @FXML private TextField txtfieldEnsaiado;
    @FXML private TextField txtfieldEmbalo;


    @FXML
    private void manualdeinstrucaoEnviar() {
        ManualdeInstrucao manual = new ManualdeInstrucao();
        manual.conversar(); // ← MANTENHA conversar()

        salvar("manual.csv", txtfieldSonhos.getText() + "," + txtfieldGostos.getText() + "," + txtfieldPensamentos.getText());
        limparCamposManual();
    }


    @FXML
    private void equalizadorEnviar() {
        Equalizador equalizador = new Equalizador();
        equalizador.conversar();

        salvar("equalizador.csv", txtfieldCheiro.getText() + "," + txtfieldSolta.getText() + "," + txtfieldDistracao.getText());
        limparCamposEqualizador();
    }


    @FXML
    private void ritmoEnviar() {
        Ritmo ritmo = new Ritmo();
        ritmo.devagar();

        salvar("ritmo.csv", txtfieldBalanco.getText() + "," + txtfieldEnsaiado.getText() + "," + txtfieldEmbalo.getText());
        limparCamposRitmo();
    }


    private void salvar(String arquivo, String dados) {
        try {
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(dados + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }


    private void limparCamposManual() {
        txtfieldSonhos.clear();
        txtfieldGostos.clear();
        txtfieldPensamentos.clear();
    }

    private void limparCamposEqualizador() {
        txtfieldCheiro.clear();
        txtfieldSolta.clear();
        txtfieldDistracao.clear();
    }

    private void limparCamposRitmo() {
        txtfieldBalanco.clear();
        txtfieldEnsaiado.clear();
        txtfieldEmbalo.clear();
    }
}