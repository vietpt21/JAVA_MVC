package vietpt.entity;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static javax.xml.bind.DatatypeConverter.printHexBinary;

public class MD5Convert {

    public  String genMD5(String key) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(key.getBytes());
        byte[] digest = md.digest();
        String myHash = printHexBinary(digest).toUpperCase();
        return  myHash;

    }

    public  String getMD5(String key) throws NoSuchAlgorithmException {

        String md5Hex = DigestUtils
                .md5Hex(key).toUpperCase();
        return md5Hex;
    }

}
