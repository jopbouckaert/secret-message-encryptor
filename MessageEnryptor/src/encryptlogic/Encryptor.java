/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptlogic;

/**
 *
 * @author jopbo_000
 */
public class Encryptor {
    
    private String secretkey;
    
    public Encryptor(String secretkey){
        
        this.secretkey = secretkey;
        
    }
   
    public String encrypt(String originalMessage){
        char[] character = null;
        int[] intMessage = null;
        for(int i=0; i<originalMessage.length();i++){
           
          
           character[i] = originalMessage.charAt(i);
        }
        for(int i=0; i<originalMessage.length();i++){
        
            intMessage[i] = (int)character[i];
            
        }
        
        EncryptedIntMessage = intMessage[i]
        
        
    }
    
    public String decrypt(String encryptedMessage){
        
    }
    
    
}
