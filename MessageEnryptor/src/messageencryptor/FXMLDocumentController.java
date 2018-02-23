/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageencryptor;

import encryptlogic.Encryptor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

/**
 *
 * @author jopbo_000
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea MessageTextArea;
    @FXML
    private PasswordField PasswordField;
    
    
    @FXML
    private void handleButtonEncrypt(ActionEvent event) {
        String clearText = MessageTextArea.getText();
        String secretkey = PasswordField.getText();
        Encryptor encryptor = new Encryptor(secretkey);
        String encryptedMessage = encryptor.encrypt(clearText);
        MessageTextArea.setText(encryptedMessage);
        
    }
    
    @FXML
    private void handleButtonDecrypt(ActionEvent event) {
        String clearText = MessageTextArea.getText();
        String secretkey = PasswordField.getText();
        Encryptor encryptor = new Encryptor(secretkey);
        String decryptedMessage = encryptor.decrypt(clearText);
        MessageTextArea.setText(decryptedMessage);
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
