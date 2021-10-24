import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSA_Encryption_Decryption {
	public static void main(String[] args) throws Exception {
        String msg = "Password is 12345";
        
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        KeyPair pair = generator.generateKeyPair();
        
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();
        
        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] secretMessageBytes = msg.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedMessageBytes = encryptCipher.doFinal(secretMessageBytes);
        String encodedMessage = Base64.getEncoder().encodeToString(encryptedMessageBytes);
        
        
        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedMessageBytes = decryptCipher.doFinal(encryptedMessageBytes);
        String decryptedMessage = new String(decryptedMessageBytes, StandardCharsets.UTF_8);
        
        System.out.println("---------Encrypt Message--------- ");
        System.out.println(encodedMessage);
        System.out.println(" ");
        
        System.out.println("---------Decrypted Message---------");
        System.out.println(decryptedMessage);
        System.out.println(" ");
        
        System.out.println("---------Public key---------");
        System.out.println(publicKey.toString());
        System.out.println(" ");
        
        System.out.println("---------Privat key---------");
        System.out.println( privateKey.toString());
        
    }
    
}
