import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest.txt");

            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }

            fis.close();
            fos.close();
            System.out.println("File copied successfully");
        } catch(IOException e) {
            System.out.println("Error");
        }
    }
}