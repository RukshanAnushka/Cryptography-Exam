public class Railfence_Cipher_Decrypt {
      int railFence;              //create variable

    public Railfence_Cipher_Decrypt(int railFence) {
        this.railFence = railFence;
    }

    String getDecryptedData(String data) {          //create Decrypting function
        char[] decrypted = new char[data.length()];
        int n = 0;
        for(int k = 0 ; k < railFence; k ++) {
            int index = k;
            boolean down = true;                    //check the logical values 
            while(index < data.length() ) {
                decrypted[index] = data.charAt(n++);
                
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
        return new String(decrypted);
    }
    	public static void main(String[] args) {
        
    		String message = "C aceola  uubrosCm";      //Enter the Message
    		Railfence_Cipher_Decrypt Railfence_Cipher_Decrypt = new Railfence_Cipher_Decrypt(3); //Key value

        
    		System.out.println("----Decrypted message----");
    		String decrypted = Railfence_Cipher_Decrypt.getDecryptedData(message);
    		System.out.println(decrypted);            //calling decryption method
        

    }
}
  