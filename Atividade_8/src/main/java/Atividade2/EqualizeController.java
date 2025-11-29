package Atividade2;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class EqualizeController {

    // CAMPOS PARA MANUAL DE INSTRUÇÃO
    @FXML private TextField txtfieldSonhos;
    @FXML private TextField txtfieldGostos;
    @FXML private TextField txtfieldPensamentos;

    // CAMPOS PARA EQUALIZADOR
    @FXML private TextField txtfieldCheiro;
    @FXML private TextField txtfieldSolta;
    @FXML private TextField txtfieldDistracao;

    // CAMPOS PARA RITMO
    @FXML private TextField txtfieldBalanco;
    @FXML private TextField txtfieldEnsaiado;
    @FXML private TextField txtfieldEmbalo;

    // BOTÕES
    @FXML private Button btnmanualdeinstrucaoEnviar;
    @FXML private Button btnequalizadorEnviar;
    @FXML private Button btnritmoEnviar;

    @FXML
    public void initialize() {
        System.out.println("Interface carregada!");
    }


    private void animarBotao(Button botao) {
        ScaleTransition scale = new ScaleTransition(Duration.millis(150), botao);
        scale.setToX(0.9);
        scale.setToY(0.9);
        scale.setAutoReverse(true);
        scale.setCycleCount(2);

        scale.setOnFinished(e -> {

            if (botao == btnequalizadorEnviar) {
                botao.setStyle("-fx-background-color: linear-gradient(to bottom, #9d4edd, #7b2cbf);");
            } else if (botao == btnmanualdeinstrucaoEnviar) {
                botao.setStyle("-fx-background-color: linear-gradient(to bottom, #9d4edd, #7b2cbf);");
            } else if (botao == btnritmoEnviar) {
                botao.setStyle("-fx-background-color: linear-gradient(to bottom, #9d4edd, #7b2cbf);");
            }
        });

        scale.play();
    }

    // MÉTODO PARA MANUAL DE INSTRUÇÃO
    @FXML
    private void manualdeinstrucaoEnviar() {
        animarBotao(btnmanualdeinstrucaoEnviar);

        try {
            String sonhos = txtfieldSonhos.getText();
            String gostos = txtfieldGostos.getText();
            String pensamentos = txtfieldPensamentos.getText();

            if (sonhos.isEmpty() || gostos.isEmpty() || pensamentos.isEmpty()) {
                mostrarAlerta("Preencha todos os campos do Manual!");
                return;
            }

            ManualdeInstrucao manual = new ManualdeInstrucao(sonhos, gostos, pensamentos);
            MySQLCRUD.criarManual(manual);


            System.out.print("Manual - Método conversar(): ");
            manual.conversar();

            limparCamposManual();
            mostrarSucesso("Manual salvo no MySQL com sucesso!");

        } catch (Exception e) {
            mostrarErro("Erro ao salvar Manual: " + e.getMessage());
        }
    }

    // MÉTODO PARA EQUALIZADOR
    @FXML
    private void equalizadorEnviar() {
        animarBotao(btnequalizadorEnviar);

        try {
            String cheiro = txtfieldCheiro.getText();
            String solta = txtfieldSolta.getText();
            String instrucao = txtfieldDistracao.getText();

            if (cheiro.isEmpty() || solta.isEmpty() || instrucao.isEmpty()) {
                mostrarAlerta("Preencha todos os campos do Equalizador!");
                return;
            }

            Equalizador equalizador = new Equalizador(cheiro, solta, instrucao);
            MySQLCRUD.criarEqualizador(equalizador);

            // Executa o método original da classe
            System.out.print("Equalizador - Método transportar(): ");
            equalizador.transportar();

            limparCamposEqualizador();
            mostrarSucesso("Equalizador salvo no MySQL com sucesso!");

        } catch (Exception e) {
            mostrarErro("Erro ao salvar Equalizador: " + e.getMessage());
        }
    }

    // MÉTODO PARA RITMO
    @FXML
    private void ritmoEnviar() {
        animarBotao(btnritmoEnviar);

        try {
            String balanco = txtfieldBalanco.getText();
            String ensaiado = txtfieldEnsaiado.getText();
            String embalo = txtfieldEmbalo.getText();

            if (balanco.isEmpty() || ensaiado.isEmpty() || embalo.isEmpty()) {
                mostrarAlerta("Preencha todos os campos do Ritmo!");
                return;
            }

            Ritmo ritmo = new Ritmo(balanco, ensaiado, embalo);
            MySQLCRUD.criarRitmo(ritmo);


            System.out.print("Ritmo - Método devagar(): ");
            ritmo.devagar();

            limparCamposRitmo();
            mostrarSucesso("Ritmo salvo no MySQL com sucesso!");

        } catch (Exception e) {
            mostrarErro("Erro ao salvar Ritmo: " + e.getMessage());
        }
    }

    // MÉTODOS AUXILIARES
    private void limparCamposManual() {
        txtfieldSonhos.clear();
        txtfieldGostos.clear();
        txtfieldPensamentos.clear();
        System.out.println("Campos do Manual limpos!");
    }

    private void limparCamposEqualizador() {
        txtfieldCheiro.clear();
        txtfieldSolta.clear();
        txtfieldDistracao.clear();
        System.out.println("Campos do Equalizador limpos!");
    }

    private void limparCamposRitmo() {
        txtfieldBalanco.clear();
        txtfieldEnsaiado.clear();
        txtfieldEmbalo.clear();
        System.out.println("Campos do Ritmo limpos!");
    }

    // MÉTODOS DE ALERTA
    private void mostrarSucesso(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso!");
        alert.setHeaderText("Operação Concluída");
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void mostrarAlerta(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Atenção");
        alert.setHeaderText("Verifique os Campos");
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void mostrarErro(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText("Algo deu errado");
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    // MÉTODO EXTRA: LIMPAR TODOS OS CAMPOS
    @FXML
    private void limparTodosCampos() {
        limparCamposManual();
        limparCamposEqualizador();
        limparCamposRitmo();
        mostrarSucesso("Todos os campos foram limpos!");
    }
}