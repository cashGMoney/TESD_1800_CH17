import java.io.*;
import java.util.Random;

public class Exercise17_01 {
    public static void main(String[] args) {
        // Create the filepath
        String filePath = "C:\\Users\\cashg\\OneDrive\\Desktop\\TESD_1400\\Projects\\Exercise17_01.txt";

        try (

            // Create an output FileWriter
            // You should always use buffered I/O to speed up input and output.
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
        ) {
            // Create random variable
            Random random = new Random();

            // Loop for creating 100 values
            for (int i = 0; i < 100; i++) {

                // Generate Random number between 1 and 100 for each loop
                int randomNumber = random.nextInt(100) + 1; 

                // Generate a space unless it's the last number
                writer.write(randomNumber + (i < 99 ? " " : "")); 
            }

            // Add a newline after writing 100 numbers (helps with error)
            writer.newLine(); 

        // Error Catching Line of code
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read values from the file
        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

