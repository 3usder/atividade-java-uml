package org.example.atividadee2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.FileWriter;

public class EqualizadorController {

    @FXML private TextField txtfieldCheiro;
    @FXML private TextField txtfieldSolta;
    @FXML private TextField txtfieldInstrucao;
    @FXML private Button btnEnviar;

    @FXML
    private void salvarNoCSV() {
        try {
            String cheiro = txtfieldCheiro.getText();
            String solta = txtfieldSolta.getText();
            String instrucao = txtfieldInstrucao.getText();

            FileWriter writer = new FileWriter("equalizador.csv", true);
            writer.append(cheiro).append(",").append(solta).append(",").append(instrucao).append("\n");
            writer.close();

            System.out.println("Transportando: " + cheiro + " - " + solta + " - " + instrucao);
            System.out.println("Salvo no CSV!");

            txtfieldCheiro.clear();
            txtfieldSolta.clear();
            txtfieldInstrucao.clear();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}