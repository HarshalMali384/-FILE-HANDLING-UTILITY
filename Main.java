package org.studyeasy;

import java.io.*;

public class Main {
    public static void main(String[] args){


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("codetech//harshal.txt"));

            BufferedWriter bw1 = bw;
            bw1.write("performing write operation. ");
            bw1.write("\nwrite operation is done ");


            bw1.close();
            System.out.println("write operation is done ");


        } catch (IOException e) {
            e.printStackTrace();

        }
        try {
            BufferedReader reader = new BufferedReader((new FileReader("codetech//readoperation.txt")));
            String line ;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("read operation is done");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
