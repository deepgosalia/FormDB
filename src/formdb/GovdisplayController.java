/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class GovdisplayController implements Initializable {

    
    
    @FXML
    TextField govaadharno,govpanno,govgstno,govpassportno;
    @FXML
    Button govsubmit,back,viewdetails;
    /**
     * Initializes the controller class.
     */
    String $govaadharno,$govpanno,$govgstno,$govpassportno;
    
    
 @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
                 
        if(event.getSource()==viewdetails){
              
          
                System.out.println("hsrhgdgfgdf");
        String parray[] = new String[4];
        try {
            parray=Govdisplaydb.displayPosts();
            
            System.out.println(parray[0]);
            govaadharno.setText(parray[0]);
            govpanno.setText(parray[1]);
            govgstno.setText(parray[2]);
            govpassportno.setText(parray[3]);
            

            
            
        } catch (IOException ex) {
            Logger.getLogger(PersonaldisplayController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       if(event.getSource()==back){
              
          
                Parent parent = FXMLLoader.load(getClass().getResource("displaylist.fxml"));
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
