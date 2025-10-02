package Atividade2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EqualizadorController {

    @FXML private TextField txtfieldCheiro;
    @FXML private TextField txtfieldSolta;
    @FXML private TextField txtfieldInstrucao;


    private final Path csvPath = Path.of("src/main/resources/manual_instrucoes_equalize.csv");

    @FXML
    private void onEnviar(ActionEvent event) {
        String cheiro = txtfieldCheiro.getText().trim();
        String solta = txtfieldSolta.getText().trim();
        String instrucao = txtfieldInstrucao.getText().trim();

        try {
            Equalizador equalizador = new Equalizador(cheiro, solta, instrucao);
            equalizador.conversar();

            writeCsvHeaderIfNeeded();
            String linha = escapeCsv(equalizador.getSonhos()) + "," +
                    escapeCsv(equalizador.getGostos()) + "," +
                    escapeCsv(equalizador.getPensamentos()) + System.lineSeparator();

            Files.writeString(csvPath, linha, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            txtfieldCheiro.clear();
            txtfieldSolta.clear();
            txtfieldInstrucao.clear();

            System.out.println("Dados salvos no arquivo CSV");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeCsvHeaderIfNeeded() throws IOException {
        if (Files.notExists(csvPath)) {
            String header = "cheiro,solta,instrucao" + System.lineSeparator();
            Files.writeString(csvPath, header, StandardOpenOption.CREATE);
        }
    }

    private String escapeCsv(String s) {
        if (s == null) return "";
        String result = s.replace("\"", "\"\"");
        if (result.contains(",") || result.contains("\"") || result.contains("\n")) {
            return "\"" + result + "\"";
        } else {
            return result;
        }
    }
}