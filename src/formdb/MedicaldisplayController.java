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
public class MedicaldisplayController implements Initializable {

    
    @FXML
     TextField medbloodgroup,medhandicap,meddetails;
    @FXML
    Button medsubmit,back,viewdetails;
    /**
     * Initializes the controller class.
     */
    String $medbloodgroup,$medhandicap,$meddetails; 
    


    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
          if(event.getSource()==viewdetails){
              
          
                System.out.println("hsrhgdgfgdf");
        String parray[] = new String[3];
        try {
            parray=Medicaldisplaydb.displayPosts();
            
            System.out.println(parray[0]);
            medbloodgroup.setText(parray[0]);
            medhandicap.setText(parray[1]);
            meddetails.setText(parray[2]);
            

            
            
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
