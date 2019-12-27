/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author rushabh
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button user,thirdparty;
            
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==user){
            Parent parent = FXMLLoader.load(getClass().getResource("userlogin.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        else if(event.getSource()==thirdparty){
            Parent parent = FXMLLoader.load(getClass().getResource("thirdpartylogin.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
