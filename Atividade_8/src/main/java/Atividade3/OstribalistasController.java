package Atividade3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileWriter;

public class OstribalistasController {
    @FXML private TextField txtfieldNome, txtfieldExpressao, txtfieldPosicao;
    @FXML private TextField txtfieldPaletacores, txtfieldSimetria, txtfieldElemento;
    @FXML private TextField txtfieldTitulo, txtfielAno, txtfieldEstilo;

    @FXML private void artistaEnviar() {
        Artista artista = new Artista();
        artista.cantar();
        salvar("artista.csv", txtfieldNome.getText() + "," + txtfieldExpressao.getText() + "," + txtfieldPosicao.getText());
        limparArtista();
    }

    @FXML private void composicaoEnviar() {
        composicaoVisual composicao = new composicaoVisual();
        composicao.harmonizar();
        salvar("composicao.csv", txtfieldPaletacores.getText() + "," + txtfieldSimetria.getText() + "," + txtfieldElemento.getText());
        limparComposicao();
    }

    @FXML private void albumvisualEnviar() {
        albumMusical album = new albumMusical();
        album.reproduzir();
        salvar("album.csv", txtfieldTitulo.getText() + "," + txtfielAno.getText() + "," + txtfieldEstilo.getText());
        limparAlbum();
    }

    private void salvar(String arquivo, String dados) {
        try {
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(dados + "\n");
            writer.close();
        } catch (Exception e) {}
    }

    private void limparArtista() {
        txtfieldNome.clear(); txtfieldExpressao.clear(); txtfieldPosicao.clear();
    }

    private void limparComposicao() {
        txtfieldPaletacores.clear(); txtfieldSimetria.clear(); txtfieldElemento.clear();
    }

    private void limparAlbum() {
        txtfieldTitulo.clear(); txtfielAno.clear(); txtfieldEstilo.clear();
    }
}