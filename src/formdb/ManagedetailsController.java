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
 * FXML Controller class
 *
 * @author rushabh
 */
public class ManagedetailsController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button personaldetails,educationaldetails,financialdetails,medicaldetails,govdetails,back;
            
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==personaldetails){
            Parent parent= FXMLLoader.load(getClass().getResource("personaldetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==educationaldetails){
            Parent parent = FXMLLoader.load(getClass().getResource("educationaldetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==financialdetails){
            Parent parent = FXMLLoader.load(getClass().getResource("financialdetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==medicaldetails){
            Parent parent = FXMLLoader.load(getClass().getResource("medicaldetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==govdetails){
            Parent parent = FXMLLoader.load(getClass().getResource("govdetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("userdashboard.fxml"));
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
