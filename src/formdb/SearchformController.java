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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jets3t.service.io.TempFile;

/**
 * FXML Controller class
 *
 * @author rushabh
 */
public class SearchformController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label label;
    @FXML
    private Button search,back,formbutton;
    
    @FXML
    private TextField companyname;
           
    String $companyname;
    String[] form;
    static String temp,name;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==search){
            
            $companyname = companyname.getText();
            String formname =Searchformdb.displayForms($companyname);
            System.out.println(formname);
            form = formname.split("\\.");
            temp=form[1];
            name = form[0];
           System.out.println(form[0] + " " + form[1]);
           
           formbutton.setVisible(true);
           formbutton.setText(form[0]);
            
           Parent parent = FXMLLoader.load(getClass().getResource("searchresult.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==back){
            
            Parent parent = FXMLLoader.load(getClass().getResource("userdashboard.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        formbutton.setVisible(false);
    }  
    public static String getForm1()
    {
        return temp;
    }
    public static String getName()
    {
        return name;
    }
    
}
