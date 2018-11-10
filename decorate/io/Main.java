package chapter3.io;

import java.io.*;

public class Main {
    public static void main(String[] args){
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "D:\\Projects\\JavaProjects\\HeadFirstLearn\\src\\chapter3\\io\\test.txt")));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
