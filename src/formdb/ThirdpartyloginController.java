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
public class ThirdpartyloginController implements Initializable {

  @FXML
    private TextField tpcompany,tppassword;
    @FXML
    private Label tperrormessage;
    @FXML
    private Button tplogin,tpregister,back;
            
     String $tpcompany,$tppassword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==tplogin){
            $tpcompany = tpcompany.getText();
            $tppassword = tppassword.getText();
            boolean confirm;
             confirm=Thirdpartylogindb.checkValidity($tpcompany, $tppassword);
            if(confirm){
                Keycompanyid.setCompanyid($tpcompany);
                Parent parent = FXMLLoader.load(getClass().getResource("thirdpartydashboard.fxml"));
               Scene scene = new Scene(parent);
               Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
               stage.setScene(scene);
                stage.show();
            }
            else{
                tperrormessage.setText("Invalid companyid/password");
            }
            
           
           //errormessage.setText("Invalid Credentials");
        }
        else if(event.getSource()==tpregister){
            Parent parent = FXMLLoader.load(getClass().getResource("thirdpartyregister.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();
        }
        else{
            if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);

                stage.show();
        }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
