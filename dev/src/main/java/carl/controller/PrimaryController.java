package carl.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController implements Initializable{

    @FXML
    private MenuBar barraDeMenu;
    
    @FXML
    private Menu menuArquivo;
    @FXML
    private MenuItem menuItemContato;
    @FXML
    private MenuItem menuItemTipoContato;
    @FXML
    private MenuItem menuItemCidade;
    @FXML 
    private MenuItem menuItemUsuario;
    @FXML
    private MenuItem menuItemSair;

    @FXML
    private Menu menuRelatorio;
    @FXML
    private MenuItem menuItemRelatorioContatoGeral;
    @FXML
    private MenuItem menuItemRelatorioContatoEndereco;
    @FXML 
    private MenuItem menuItemRelatorioContatoTelefone;
    @FXML
    private MenuItem menuItemRelatorioContatoTipo;

    @FXML
    private Menu menuSobre;
    @FXML
    private MenuItem menuItemSistema;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Image imageItemContato = new Image(getClass().getResourceAsStream("/icons/iconeMenuContato.png"));
        menuItemContato.setGraphic(new ImageView(imageItemContato));
        Image imageItemTipoContato = new Image(getClass().getResourceAsStream("/icons/iconeMenuContatoTipo.png"));
        menuItemTipoContato.setGraphic(new ImageView(imageItemTipoContato));
        Image imageItemCidade = new Image(getClass().getResourceAsStream("/icons/iconeMenuCidade.png"));
        menuItemCidade.setGraphic(new ImageView(imageItemCidade));
        Image imageItemUsuario = new Image(getClass().getResourceAsStream("/icons/iconeMenuUsuario.png"));
        menuItemUsuario.setGraphic(new ImageView(imageItemUsuario));
        Image imageItemSair = new Image(getClass().getResourceAsStream("/icons/iconeMenuSair.png"));
        menuItemSair.setGraphic(new ImageView(imageItemSair));

        Image imageItemRelatorioContatoGeral = new Image(getClass().getResourceAsStream("/icons/iconeMenuRelatorio.png"));
        menuItemRelatorioContatoGeral.setGraphic(new ImageView(imageItemRelatorioContatoGeral));
        menuItemRelatorioContatoEndereco.setGraphic(new ImageView(imageItemRelatorioContatoGeral));
        menuItemRelatorioContatoTelefone.setGraphic(new ImageView(imageItemRelatorioContatoGeral));
        menuItemRelatorioContatoTipo.setGraphic(new ImageView(imageItemRelatorioContatoGeral));

        Image imageItemSistema = new Image(getClass().getResourceAsStream("/icons/iconeMenuSistema.png"));
        menuItemSistema.setGraphic(new ImageView(imageItemSistema));
    }

    @FXML
    private void acessarContato(ActionEvent event){

    }
    @FXML
    private void acessarTipoContato(ActionEvent event){
        
    }
    @FXML
    private void acessarCidade(ActionEvent event){
        
    }
    @FXML
    private void acessarUsuario(ActionEvent event){
        
    }
    @FXML
    private void acessarSair(ActionEvent event){

    }

    @FXML
    private void acessarRelatorioContatoGeral(ActionEvent event){

    }
    @FXML
    private void acessarRelatorioContatoEndereco(ActionEvent event){

    }
    @FXML
    private void acessarRelatorioContatoTelefone(ActionEvent event){

    }
    @FXML
    private void acessarRelatorioContatoTipo(ActionEvent event){

    }

    @FXML
    private void acessarRelatorioSobreSistema(ActionEvent event){

    }
    
}
