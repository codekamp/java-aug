package codekamp;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
//        try {
//            FileReader f = new FileReader("src/codekamp/hello.txt");
//            int charData = f.read();
//
//            while (charData > -1) {
//                System.out.println((char)charData);
//                charData = f.read();
//            }
//
//            BufferedReader r = new BufferedReader(f);
//            System.out.println(r.readLine());
//            System.out.println(r.readLine());
//            r.close();
//            f.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            System.out.println("Unable to read file");
//        }

//        try {
//            FileWriter r = new FileWriter("src/codekamp/hello.txt");
//            r.write("Hello world!");
//            r.close();
//        } catch (IOException e) {
//
//        }

//        try {
//            RandomAccessFile rf = new RandomAccessFile("src/codekamp/hello.txt", "rw");
//            System.out.println(rf.readLine());
//            rf.seek(rf.length());
//            rf.writeBytes("welcome to codekamp");
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//
//        }

        // File can represent both a file or a directory
        File fl = new File("src/codekamp");
//        System.out.println(fl.isDirectory());
//        System.out.println(fl.isFile());
//        System.out.println(fl.exists());
//        try {
//            fl.createNewFile();
//        } catch (IOException e) {
//
//        }


        for(File s: fl.listFiles()) {
            System.out.println(s.isDirectory());
        }
    }
}

