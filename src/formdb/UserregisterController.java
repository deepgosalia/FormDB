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
public class UserregisterController implements Initializable {

    @FXML
    private TextField reguseremail,reguserpassword,regusercpassword;
    @FXML
    private Label regusererrormessage;
    @FXML
    private Button reguserregister,back;
            
     String $reguseremail,$reguserpassword,$regusercpassword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==reguserregister){
            
            $reguseremail=reguseremail.getText();
            $reguserpassword=reguserpassword.getText();
            $regusercpassword=regusercpassword.getText();
            System.out.println($regusercpassword+$reguseremail+$reguserpassword);
            if($regusercpassword.equals($reguserpassword)){
            Userregisterdb.insertData($reguseremail, $reguserpassword);
            Keyemail.setEmail($reguseremail);
            Parent parent = FXMLLoader.load(getClass().getResource("userdashboard.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();
            }
            else{
                regusererrormessage.setText("Password do not match !");
         }
           
           //errormessage.setText("Invalid Credentials");
        }
        if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("userlogin.fxml"));
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
