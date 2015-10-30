package com.java.tests;

import java.io.*;
import java.util.Date;

/**
 * Created by temo on 10/25/15.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File("/home/temo/Downloads/file.txt"));
        DataOutput dataOutput = new DataOutputStream(outputStream);

        dataOutput.writeByte((byte) 89);
        dataOutput.writeUTF("I am Robot");
        outputStream.flush();
        outputStream.close();

        InputStream inputStream = new FileInputStream(new File("/home/temo/Downloads/file.txt"));
        DataInput dataInput = new DataInputStream(inputStream);
        byte aDataInput = dataInput.readByte();
        String str = dataInput.readUTF();
        System.out.println(aDataInput + " " + str);
        inputStream.close();

        System.out.printf("%tc", new Date());
        System.out.println();
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}
