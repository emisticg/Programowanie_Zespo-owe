/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektowaniezespołowe;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Bush
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button zaloguj;
    @FXML 
    private Button zarządzaj;
    @FXML 
    private Button potwierdz;
    @FXML 
    private Button potwierdzZarzadzanie2;
    @FXML 
    private Button odrzuc;
    @FXML 
    private Button panelAdmina;
    @FXML 
    private Button dodajProjekt;
    @FXML 
    private Button dodajZadanie;
    @FXML 
    private Button edytujZadanie;
    @FXML 
    private Button generujRaport;
    @FXML 
    private Button wygenerujRaport;
    @FXML 
    private Button powrotGenerowanieRaportu;  
    @FXML 
    private Button powrotEdycjaZadania;
    @FXML 
    private Button powrotDodajProjekt;
    @FXML 
    private Button powrotDodajZadanie;
    @FXML 
    private Button powrotPanelAdmina;
    @FXML 
    private Button powrotZarzadzanie;
    @FXML 
    private Button powrotLogowanie;
    @FXML 
    private Button zatwierdzZmiany;
    @FXML 
    private Button zapiszZmiany;
    @FXML 
    private Button zatwierdzZmianyZadanie;
    @FXML 
    private Button finalizujZadanie;
    
    private dbConnection dc;


    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    @FXML
    private void zalogujButtonAct(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("Wybor Projektu (Lider).fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Wybor Projektu");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        //dc=new dbConnection(); 
        //Connection conn = dc.Connect();

        Stage stage = (Stage) zaloguj.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    }
    
    @FXML
    private void zarządzajButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Zarządzaj.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Zarządzanie");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) zarządzaj.getScene().getWindow();
        stage.close();      
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void panelAdminaButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Panel Admina.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Panel Admina");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
         Stage stage = (Stage) panelAdmina.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void dodajProjektButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Dodaj Projekt.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Dodaj Projekt");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) dodajProjekt.getScene().getWindow();
        stage.close();
        
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void dodajZadanietButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Dodaj Zadanie.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Dodaj Zadanie");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) dodajZadanie.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void edytujZadanietButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Edycja zadania.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("Edycja Zadania");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) edytujZadanie.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void generujRaporttButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Generowanie raportu.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) generujRaport.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
        
    }
    
    @FXML
    private void powrotGenerowanieRaportuButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Edycja zadania.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotGenerowanieRaportu.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    } 
    
    @FXML
    private void powrotEdycjaZadaniaButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Wybor Projektu (Lider).fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotEdycjaZadania.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    } 
    
    @FXML
    private void powrotDodajProjektButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Wybor Projektu (Lider).fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotDodajProjekt.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    } 
    
    @FXML
    private void powrotDodajZadanieButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Wybor Projektu (Lider).fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotDodajZadanie.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    } 

    @FXML
    private void powrotPanelAdminaButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Wybor Projektu (Lider).fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotPanelAdmina.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    }
    
    @FXML
    private void powrotZarzadzanieButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("Panel Admina.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotZarzadzanie.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    }
    
    @FXML
    private void powrotLogowanieButtonAction(ActionEvent event) throws IOException {
        
        Parent loader = FXMLLoader.load(getClass().getResource("logowanie.fxml"));
        Scene edit_scene = new Scene(loader);
        Stage edit_stage = new Stage();
        edit_stage.setTitle("");
        edit_stage.setScene(edit_scene);
        edit_stage.setResizable(false);
        edit_stage.sizeToScene();
        edit_stage.initModality(Modality.APPLICATION_MODAL);
        Stage stage = (Stage) powrotLogowanie.getScene().getWindow();
        stage.close();
        edit_stage.showAndWait();
    }
    
    @FXML
    private void potwierdz(ActionEvent event) throws IOException {
        showMessageDialog(null,"Potwierdzono");
    }

    @FXML
    private void potwierdzZarzadzanie2(ActionEvent event) throws IOException {
        showMessageDialog(null,"Potwierdzono");
    }
    
     private void potwierdza() throws IOException {
        showMessageDialog(null,"Potwierdzono");
    }

     @FXML
    private void odrzuc(ActionEvent event) throws IOException {
        showMessageDialog(null,"Odrzucono");
    }
    
    @FXML
    private void zatwierdzZmiany(ActionEvent event) throws IOException {
        showMessageDialog(null,"Zmiany zostały zatwierdzone");
    }

    @FXML
    private void zapiszZmiany(ActionEvent event) throws IOException {
        showMessageDialog(null,"Zmiany zostały zapisane");
    }
    
    @FXML
    private void zatwierdzZmianyZadanie(ActionEvent event) throws IOException {
        showMessageDialog(null,"Zmiany zostały zatwierdzone");
    }
    
    @FXML
    private void wygenerujRaport(ActionEvent event) throws IOException {
        showMessageDialog(null,"Raport został wygenerowany");
    }
    
    @FXML
    private void finalizujZadanie(ActionEvent event) throws IOException {
        showMessageDialog(null,"Zadanie zostało sfinalizowane");
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void Close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
