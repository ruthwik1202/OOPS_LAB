import java.io.FileWriter;
import java.io.IOException;

class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt", true);
            fw.write("\nAppending new data");
            fw.close();
            System.out.println("Data appended");
        } catch(IOException e) {
            System.out.println("Error");
        }
    }
}