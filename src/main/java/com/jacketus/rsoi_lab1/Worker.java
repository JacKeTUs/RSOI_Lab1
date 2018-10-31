package com.jacketus.rsoi_lab1;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Worker {
    public static String getSHA256Hash(String s) {
        String encryptedString = "No string";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(s.getBytes("UTF-8"));
            encryptedString = bytesToHex(hash);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }

    private static String bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }

}
