import java.util.*;

public class CeaserCipher_Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the Key value: ");
        
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
    
        for(int i=0; i < plaintext.length();i++)
        {
            alphabet = plaintext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')      // check the alphabet simple letters (a-z)
            {
            alphabet = (char) (alphabet + shift);       // shift alphabet
            if(alphabet > 'z')                          //check alphabet greater than z
            {
            alphabet = (char) (alphabet+'a'-'z'-1);     // reshift to start
            }
            ciphertext = ciphertext + alphabet;
            }
         //------------------------------------------------------
            else if(alphabet >= 'A' && alphabet <= 'Z') // check the alphabet capital letters (A-Z)
            {
            alphabet = (char) (alphabet + shift);
            if(alphabet > 'Z')                          // check shift alphabet greater than 'Z'
            {
            alphabet = (char) (alphabet+'A'-'Z'-1);     //reshift to start
            }
            ciphertext = ciphertext + alphabet;
            }
            else 
            {
              ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println(" ciphertext : " + ciphertext);
    }
}