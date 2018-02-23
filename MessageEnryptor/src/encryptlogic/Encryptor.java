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

        char[] encryptedMessageChar = new char [50];
        encryptingMessage(originalMessage,encryptedMessageChar); 
        return makeStringEncrypt(encryptedMessageChar);

    }
       
    
    
        
    
    public String decrypt(String encryptedMessage){
        char[] encryptedMessageChar = new char [50];
            

            
        decryptingMessage(encryptedMessage,encryptedMessageChar); 
        return makeStringDecrypt(encryptedMessageChar);
    }

    
    
    
    
    
    
    private void encryptingMessage(String originalMessage,char[] encryptedMessageChar) {
        int[] character = new int[50];
        int[] intMessage = new int[50];
        int[] encryptedIntMessage = new int[50];
        int secretInt = 0;

        for(int i=0; i<originalMessage.length();i++){

           character[i] = originalMessage.charAt(i);
           intMessage[i] = (int)character[i];
           secretInt = Integer.parseInt(secretkey);
           encryptedIntMessage[i] = intMessage[i] + secretInt;
           encryptedMessageChar[i] = (char)(encryptedIntMessage[i]);
        }
    }    
    
    
    
    
    
    private String makeStringEncrypt(char[] encryptedMessageChar) {
        String encryptedMessage;
        encryptedMessage = new String(encryptedMessageChar);
        System.out.println(encryptedMessage);
        return encryptedMessage;
    }

    
    
    
    
    

    private void decryptingMessage(String encryptedMessage, char[] encryptedMessageChar) {
        
        int[] character = new int[50];
        int[] intMessage = new int[50];
        int[] originalIntMessage = new int[50];
        //String[] encryptedMessageArray= new String [50];
        int secretInt = 0;

        for(int i=0; i<encryptedMessage.length();i++){

            character[i] = encryptedMessage.charAt(i);
            System.out.println(character[i]);
            intMessage[i] = (int)character[i];
            secretInt = Integer.parseInt(secretkey);
            System.out.println(secretInt);
            originalIntMessage[i] = intMessage[i] - secretInt;
            System.out.println(originalIntMessage[i]);
            encryptedMessageChar[i] = (char)(originalIntMessage[i]);
           
        }
        
    }

    
    
    
    
    private String makeStringDecrypt(char[] encryptedMessageChar) {
        String originalMessage;
        
        originalMessage = new String(encryptedMessageChar);
        System.out.println(originalMessage);
        return originalMessage;   
    }
    
    
}
