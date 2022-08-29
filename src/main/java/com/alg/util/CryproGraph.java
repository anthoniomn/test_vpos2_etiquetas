package com.alg.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

import com.alg.model.Segments;

public class CryproGraph {

    public static byte[] getCheckSun(Segments objConf) throws Exception  {
        try {
            byte[] buffer = new byte[1024];
            buffer = serialize(objConf);
            MessageDigest md5 = MessageDigest.getInstance("MD5"); 
            return md5.digest(buffer);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("problema en la encriptacion");
            return null;
        }
    }

    public static String getStringMD5(Segments objConf) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.digest(objConf.toString().getBytes());
            return new String(Hex.encodeHex(md5.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("problema en la encriptacion");
            return null;
        }
    }

    public static byte[] serialize(Object obj) throws Exception  {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(obj);
        return b.toByteArray();
    }

}
