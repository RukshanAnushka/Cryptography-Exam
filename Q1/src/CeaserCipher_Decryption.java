import java.util.*;

public class CeaserCipher_Decryption {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the ciphertext message : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Enter the shift value : ");
        
        int shift = sc.nextInt();
        String decryptMessage = "";
        char alphabet;
        
        for(int i=0; i < ciphertext.length();i++)
            {
            alphabet = ciphertext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')      // check the alphabet simple letters (a-z)
            {
            alphabet = (char) (alphabet - shift);       // shift alphabet
            if(alphabet < 'a') 
            {                        //check alphabet less than a
            alphabet = (char) (alphabet-'a'+'z'+1);     // reshift to start
            }
            decryptMessage = decryptMessage + alphabet;
            }
          //------------------------------------------------------
            else if(alphabet >= 'A' && alphabet <= 'Z')  // check the alphabet simple letters (A-Z)
            {      
            alphabet = (char) (alphabet - shift);        // shift alphabet
            if (alphabet < 'A') {                       //check alphabet less than A
            alphabet = (char) (alphabet-'A'+'Z'+1);     // reshift to start
            }
            decryptMessage = decryptMessage + alphabet;
            }
            else
            {
            decryptMessage = decryptMessage + alphabet;
            }
            }
        System.out.println(" decrypt message : " + decryptMessage);
        }
     }
    
