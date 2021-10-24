
public class Railfence_Cipher {
    int railFence;              //create variable

    public Railfence_Cipher(int railFence) {
        this.railFence = railFence;
    }

    String getEncryptedData(String data) {          //create Encrypting function
        char[] encrypted = new char[data.length()];
        int n = 0;
        for(int k = 0 ; k < railFence; k ++) {
            int index = k;
            boolean down = true;                     //check the logical values 
            while(index < data.length() ) {
                encrypted[n++] = data.charAt(index);
                
                if(k == 0 || k == railFence - 1) {
                    index = index + 2 * (railFence - 1);
                }
                else if(down) {
                    index = index +  2 * (railFence - k - 1);
                    down = !down;
                }
                else {
                    index = index + 2 * k;
                    down = !down;
                }
            }
        }
        return new String(encrypted);
    }
    
    public static void main(String[] args) {
        String message = "Cool as a Cucumber";      //Enter the Message
        
        Railfence_Cipher Railfence_Cipher = new Railfence_Cipher(3); //Key value
        
        System.out.println("-----Encrypted message----");
        String encrypted =Railfence_Cipher.getEncryptedData(message);
        System.out.println(encrypted);              //calling encryption method
        System.out.println(" ");
        

    }
}
