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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rushabh
 */
public class ThirdpartytregisterController implements Initializable {

    @FXML
    private TextField regtpcompany,regtppassword,regtpcpassword;
    @FXML
    private Label regtperrormessage;
    @FXML
    private Button regtpregister,back;
            
     String $regtpcompany,$regtppassword,$regtpcpassword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==regtpregister){
            
            $regtpcompany = regtpcompany.getText();
            $regtppassword = regtppassword.getText();
            $regtpcpassword=regtpcpassword.getText();
            if($regtppassword.equals($regtpcpassword)){
            Thirdpartyregisterdb.insertData($regtpcompany, $regtppassword);
            System.out.println("insert hua!!");
            Parent parent = FXMLLoader.load(getClass().getResource("thirdpartydashboard.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();}
            else
            {
                regtperrormessage.setText("Passwords do not match!");
            }
           
           //errormessage.setText("Invalid Credentials");
        }
        if(event.getSource()==back){
              
          
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
