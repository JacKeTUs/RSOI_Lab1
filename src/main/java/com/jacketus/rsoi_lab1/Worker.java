package com.jacketus.rsoi_lab1;
import java.security.MessageDigest;

public class Worker {
    public static String getSHA256Hash(String s) {
        String encryptedString = "No string";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(s.getBytes());
            encryptedString = new String(messageDigest.digest());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }
}
