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
public class PersonaldetailsController implements Initializable {

    @FXML
    TextField prname,prdob,prgender,prcontactno,praddress,prcaste,prmaritalstatus;
    
    @FXML
    Button prsubmit,back;
    /**
     * Initializes the controller class.
     */
    String $prname,$prdob,$prgender,$prcontactno,$praddress,$prcaste,$prmaritalstatus;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(event.getSource()==prsubmit){
           $prname= prname.getText();
           $prdob= prdob.getText();
           $prgender = prgender.getText();
           $prcontactno = prcontactno.getText();
           $praddress=praddress.getText();
           $prcaste=prcaste.getText();
           $prmaritalstatus=prmaritalstatus.getText();

           Personaldetailsdb.insertData($prname, $prdob, $prgender, $prcontactno, $praddress, $prcaste, $prmaritalstatus);
          
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
