import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        try {
            // Create BufferedReader to read user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter text to be stored in the file: ");
            String userInput = reader.readLine();

            // Specify the file path
            String filePath = "output.txt";

            // Create BufferedWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Write user input to the file
            writer.write(userInput);

            // Close the writer
            writer.close();

            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
 
