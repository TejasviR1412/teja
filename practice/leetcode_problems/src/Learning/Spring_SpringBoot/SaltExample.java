package Learning.Spring_SpringBoot;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SaltExample {
    public static void main(String[] args) {
        String passwordToHash = "myPassword";

        //create Salt for the password
        byte[] salt = createSalt();

        //create a hash for Password + salt
        String securePassword = getSecurePassword(passwordToHash,salt);

        System.out.println("Hashed password:" + securePassword);
    }

    //create Salt
    private static byte[] createSalt(){
        SecureRandom random = new SecureRandom();

        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    //create a hash
    private static String getSecurePassword(String passwordToHash , byte[] salt){
        String generatedPassword = null;

        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);

            byte[] bytes = md.digest(passwordToHash.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte aByte : bytes) {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }

            generatedPassword = sb.toString();

        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        return generatedPassword;
    }
}