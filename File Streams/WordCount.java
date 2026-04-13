import java.io.File;
import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);

            int count = 0;
            while(sc.hasNext()) {
                sc.next();
                count++;
            }

            System.out.println("Word count: " + count);
            sc.close();
        } catch(Exception e) {
            System.out.println("Error reading file");
        }
    }
}