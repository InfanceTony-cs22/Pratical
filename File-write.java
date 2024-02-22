import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "Hello, writing data to a file using OutputStream.";

        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
