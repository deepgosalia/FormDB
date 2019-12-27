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
public class PersonaldisplayController implements Initializable {

    @FXML
    TextField prname,prdob,prgender,prcontactno,praddress,prcaste,prmaritalstatus;
    
    @FXML
    Button prsubmit,back,viewdetails;
    /**
     * Initializes the controller class.
     */
    String $prname,$prdob,$prgender,$prcontactno,$praddress,$prcaste,$prmaritalstatus;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

           if(event.getSource()==viewdetails){
              
          
                System.out.println("hsrhgdgfgdf");
        String parray[] = new String[7];
        try {
            parray=Personaldisplaydb.displayPosts();
            
            System.out.println(parray[0]);
            prname.setText(parray[0]);
            prdob.setText(parray[1]);
            prgender.setText(parray[2]);
            prcontactno.setText(parray[3]);
            praddress.setText(parray[4]);
            prcaste.setText(parray[5]);
            prmaritalstatus.setText(parray[6]);

            
            
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODOS
       /* System.out.println("hsrhgdgfgdf");
        String parray[] = new String[7];
        try {
            parray=Personaldisplaydb.displayPosts();
            
            System.out.println(parray[0]);
            prname.setText(parray[0]);
            prdob.setText(parray[1]);
            prgender.setText(parray[2]);
            prcontactno.setText(parray[3]);
            praddress.setText(parray[4]);
            prcaste.setText(parray[5]);
            prmaritalstatus.setText(parray[6]);

            
            
        } catch (IOException ex) {
            Logger.getLogger(PersonaldisplayController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }    
    
}
