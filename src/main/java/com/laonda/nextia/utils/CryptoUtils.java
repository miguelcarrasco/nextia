package com.laonda.nextia.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

public class CryptoUtils {
    private static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    public static String calculateHMAC(String data, String key)
            throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        String hashAlgorithm = "HmacSHA512";
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), hashAlgorithm);
        Mac mac = Mac.getInstance(hashAlgorithm);
        mac.init(secretKeySpec);
        return toHexString(mac.doFinal(data.getBytes()));
    }
}
