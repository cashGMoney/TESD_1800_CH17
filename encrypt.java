import java.io.*;
import java.util.Scanner;

// Page 696 of Textbook
public class encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input file name for encryption
        System.out.print("Enter the input file name to encrypt: ");
        String inputFileEncrypt = scanner.nextLine();

        // Prompt user for output file name for encryption
        System.out.print("Enter the output file name for encrypted data: ");
        String outputFileEncrypt = scanner.nextLine();

        encryptFile(inputFileEncrypt, outputFileEncrypt);

        scanner.close();
    }

    // Method to encrypt a file by adding 5 to each byte
    public static void encryptFile(String inputFile, String outputFile) {
        try (FileInputStream input = new FileInputStream(inputFile);
             FileOutputStream output = new FileOutputStream(outputFile)) { 
            
            // Read values from the file 
            int value;
            while ((value = input.read()) != - 1)
                output.write(value + 5);
            System.out.print("Encrptyed Value output: " + value + " ");

        // Exception Error catch
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
