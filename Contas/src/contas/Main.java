/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author 5220113
 */
public class Main extends Application {
   
    @Override
    public void start(Stage palcoPrimario) throws Exception {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        AnchorPane root = (AnchorPane) loader.load();
        LoginController controller = loader.getController();
        
        Scene scene = new Scene(root);
        palcoPrimario.setTitle("Login");
        palcoPrimario.setScene(scene);
        controller.setMain(this);
        palcoPrimario.show();
        
    }
    public void mostraTelaPrincipal(Stage stage) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Contas");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
