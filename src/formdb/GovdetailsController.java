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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rushabh
 */
public class GovdetailsController implements Initializable {

    
    
    @FXML
    TextField govaadharno,govpanno,govgstno,govpassportno;
    @FXML
    Button govsubmit,back;
    /**
     * Initializes the controller class.
     */
    String $govaadharno,$govpanno,$govgstno,$govpassportno;
    
    
 @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(event.getSource()==govsubmit){
                  $govaadharno=govaadharno.getText();
                    $govpanno=govpanno.getText();
                    $govgstno=govgstno.getText();
                    $govpassportno=govpassportno.getText(); 
                    Govdetailsdb.insertData($govaadharno,$govpanno,$govgstno,$govpassportno);
                   
                /*Parent parent = FXMLLoader.load(getClass().getResource("personaldetails.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);

                stage.show();*/
        }
       if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("managedetails.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);

                stage.show();
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
