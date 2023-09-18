package reader;

import java.io.File;
import java.io.IOException;

public class Scanner {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Usuario\\Desktop\\in.txt");
        java.util.Scanner sc = null;

        try {
            sc = new java.util.Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        } finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
