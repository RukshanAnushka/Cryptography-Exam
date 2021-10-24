import java.security.MessageDigest;
import java.util.*;

public class Message_Digest {

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message: ");
        
        String message = scan.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        md.update(message.getBytes());
        byte[] digest = md.digest();
        
        System.out.println(" ");
        System.out.println("---Encrypted message using MD5---");
        System.out.println(digest);

    }
}