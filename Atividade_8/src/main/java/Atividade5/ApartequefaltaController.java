package Atividade5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;

public class ApartequefaltaController {


    @FXML private TextField txtfieldNome;
    @FXML private TextField txtfieldIdade;
    @FXML private TextField txtfieldEstadoEmotivo;


    @FXML private TextField txtfieldFormato;
    @FXML private TextField txtfieldTamanho;
    @FXML private TextField txtfieldSimbolismo;


    @FXML private TextField txtfieldTipo;
    @FXML private TextField txtfieldDuracao;
    @FXML private TextField txtfieldIntensidade;


    @FXML
    private void personagemEnviar() {
        Pessoa pessoa = new Pessoa();
        pessoa.mostrar();

        salvar("personagem.csv", txtfieldNome.getText() + "," + txtfieldIdade.getText() + "," + txtfieldEstadoEmotivo.getText());
        limparPersonagem();
    }


    @FXML
    private void pecafaltanteEnviar() {
        PecaFaltante peca = new PecaFaltante();
        peca.mostrar();

        salvar("pecafaltante.csv", txtfieldFormato.getText() + "," + txtfieldTamanho.getText() + "," + txtfieldSimbolismo.getText());
        limparPecaFaltante();
    }


    @FXML
    private void relacionamentoEnviar() {
        Relacionamento rel = new Relacionamento();
        rel.mostrar();

        salvar("relacionamento.csv", txtfieldTipo.getText() + "," + txtfieldDuracao.getText() + "," + txtfieldIntensidade.getText());
        limparRelacionamento();
    }


    private void salvar(String arquivo, String dados) {
        try {
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(dados + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }


    private void limparPersonagem() {
        txtfieldNome.clear();
        txtfieldIdade.clear();
        txtfieldEstadoEmotivo.clear();
    }

    private void limparPecaFaltante() {
        txtfieldFormato.clear();
        txtfieldTamanho.clear();
        txtfieldSimbolismo.clear();
    }

    private void limparRelacionamento() {
        txtfieldTipo.clear();
        txtfieldDuracao.clear();
        txtfieldIntensidade.clear();
    }
}