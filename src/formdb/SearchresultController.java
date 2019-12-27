/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.apache.commons.io.IOUtils;
import java.lang.String;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rushabh
 */
public class SearchresultController implements Initializable {

    /**
     * Initializes the controller class.
     */
       @FXML
       private Label l1,l2,l3,l4,l5;
       
     @FXML
    private Text label;
    @FXML
    private Button accept,back,decline;
    
    @FXML
    private TextField companyname;
           
    String $companyname;
    String[] form;
    static String temp;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==accept){
            
           Parent parent = FXMLLoader.load(getClass().getResource("displaylist.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==back){
            
            Parent parent = FXMLLoader.load(getClass().getResource("searchform.fxml"));
           Scene scene = new Scene(parent);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           
           stage.show();
        }
        if(event.getSource()==decline){
            
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
        String priority = SearchformController.getForm1();
        String title = SearchformController.getName();
        System.out.println(title);
        label.setText(title);
        
            if(priority.contains("1")){
                l1.setText("Personal Details : required");
            } else {
                l1.setText("Personal Details : not required");
            }
            if(priority.contains("2")){
                l2.setText("Educational Details : required");
            } else {
                l2.setText("Educational Details : not required");
            } 
            if(priority.contains("3")){
                l3.setText("Bank Details : required");
            } else {
                l3.setText("Bank Details : not required");
            }
            if(priority.contains("4")){
                l4.setText("Medical Details : required");
            } else {
                l4.setText("Medical Details : not required");
            } 
            if(priority.contains("5")){
                l5.setText("Government Details : required");
            } else {
                l5.setText("Government Details : not required");
            } 
        }
        
    }    
    

