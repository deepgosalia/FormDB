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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rushabh
 */
public class CreateformController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Label label;
    @FXML
    private Button submit,back;
    @FXML
    private TextField formname;
            
     @FXML
     private CheckBox personal,educational,bank,medical,government;
    //String formNeed,$personal,$educational,$bank,$medical,$government;
    String $personal="",$educational="",$bank="",$medical="",$government="",formNeed,$formname;
    
     
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        $formname = formname.getText();
        /*if(personal.isSelected()){
            $personal="1";
            
        }
        if(educational.isSelected()){
            $educational="2";
            
        }
        if(bank.isSelected()){
            $bank="3";
            
        }
        if(medical.isSelected()){
            $medical="4";
            
        }
        if(government.isSelected()){
            $government="5";
            
        }*/
        
        if(event.getSource()==submit){
         if(personal.isSelected()){
            $personal="1";
            
        }
        if(educational.isSelected()){
            $educational="2";
            
        }
        if(bank.isSelected()){
            $bank="3";
            
        }
        if(medical.isSelected()){
            $medical="4";
            
        }
        if(government.isSelected()){
            $government="5";
            
        }   
        formNeed = $personal+$educational+$bank+$medical+$government;
        
            Createformdb.insertData($formname, formNeed);
            System.out.println("Form data inserted!!");
            
            /*Parent parent = FXMLLoader.load(getClass().getResource("managedetails.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();*/
        }
               
          if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("thirdpartydashboard.fxml"));
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
