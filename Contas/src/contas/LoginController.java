/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import contas.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 5220113
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tfUser;
    @FXML
    private TextField tfSenha;
    Main main;
    Stage stage;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btOkAction(ActionEvent event) throws IOException {
        Node source =(Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        main.mostraTelaPrincipal(stage);
        
    }

    @FXML
    private void btCancelAction(ActionEvent event) {
    }
    public void setMain(Main main){
        this.main=main;
    }
}
