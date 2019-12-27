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
public class EducationaldetailsController implements Initializable {
        String $edschoolname,$edschoolyear,$edschoolpercent,$edcollegename,$edcollegeyear,$edcollegepercent,$edinstitutename,$edcoursename,$edinstyear,$edinstpercent,$edprofession;
        @FXML
        TextField edschoolname,edschoolyear,edschoolpercent,edcollegename,edcollegeyear,edcollegepercent,edinstitutename,edcoursename,edinstyear,edinstpercent,edprofession;

        @FXML
        Button edsubmit,back;
    /**
     * Initializes the controller class.
     */
        
        
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(event.getSource()==edsubmit){
       
        $edschoolname=edschoolname.getText();
                $edschoolyear=edschoolyear.getText();
                $edschoolpercent=edschoolpercent.getText();
                $edcollegename=edcollegename.getText();
                $edcollegeyear=edcollegeyear.getText();
                $edcollegepercent=edcollegepercent.getText();
                $edinstitutename=edinstitutename.getText();
                $edcoursename=edcoursename.getText();
                $edinstyear=edinstyear.getText();
                $edinstpercent=edinstpercent.getText();
                $edprofession=edprofession.getText(); 
                Educationaldetailsdb.insertData($edschoolname,$edschoolyear,$edschoolpercent,$edcollegename,$edcollegeyear,$edcollegepercent,$edinstitutename,$edcoursename,$edinstyear,$edinstpercent,$edprofession);
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
