package com.gschoudhary.design.patterns;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class TestService {
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }
    public static byte[] convertToBytes(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(object);
            System.out.println(bos.toByteArray().length);
            bos.write((int)'a');
            bos.write((int)'e');
            bos.write((int)'d');
            bos.write((int)'b');
            for (byte b: bos.toByteArray()) {
                System.out.print((byte)b);
            }
            System.out.println();
            System.out.println(bos.toByteArray().length);
            return bos.toByteArray();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Gson gson = new Gson();
        HashMap<String, String> map = new HashMap<>();
        map.put("age", "23Y");
        String g = gson.toJson(map);
//        System.out.println(g.getBytes(StandardCharsets.US_ASCII));
        String o = (String) deserialize(convertToBytes(g));
        System.out.println(o);
    }
}
