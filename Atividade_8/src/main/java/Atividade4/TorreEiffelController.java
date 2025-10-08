package Atividade4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;

public class TorreEiffelController {


    @FXML private TextField txtfieldAltura;
    @FXML private TextField txtfielPeso;
    @FXML private TextField txtfielRebites;


    @FXML private TextField txtfieldAndares;
    @FXML private TextField txtfieldCapacidades;
    @FXML private TextField txtfieldVista;


    @FXML private TextField txtfieldAnoConstrucao;
    @FXML private TextField txtfieldArquiteto;
    @FXML private TextField txtfieldEstiloArquitetonico;


    @FXML
    private void estruturaEnviar() {
        Estrutura estrutura = new Estrutura();
        estrutura.mostrar();

        salvar("estrutura.csv", txtfieldAltura.getText() + "," + txtfielPeso.getText() + "," + txtfielRebites.getText());
        limparEstrutura();
    }


    @FXML
    private void miranteEnviar() {
        Mirante mirante = new Mirante();
        mirante.mostrar();

        salvar("mirante.csv", txtfieldAndares.getText() + "," + txtfieldCapacidades.getText() + "," + txtfieldVista.getText());
        limparMirante();
    }


    @FXML
    private void monumentoEnviar() {
        Monumento monumento = new Monumento();
        monumento.mostrar();

        salvar("monumento.csv", txtfieldAnoConstrucao.getText() + "," + txtfieldArquiteto.getText() + "," + txtfieldEstiloArquitetonico.getText());
        limparMonumento();
    }


    private void salvar(String arquivo, String dados) {
        try {
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(dados + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }


    private void limparEstrutura() {
        txtfieldAltura.clear();
        txtfielPeso.clear();
        txtfielRebites.clear();
    }

    private void limparMirante() {
        txtfieldAndares.clear();
        txtfieldCapacidades.clear();
        txtfieldVista.clear();
    }

    private void limparMonumento() {
        txtfieldAnoConstrucao.clear();
        txtfieldArquiteto.clear();
        txtfieldEstiloArquitetonico.clear();
    }
}