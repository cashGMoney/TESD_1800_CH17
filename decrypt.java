import java.io.*;
import java.util.Scanner;

// Page 696 of Textbook
public class decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input file name for decryption
        System.out.print("Enter the input file name to decrypt: ");
        String inputFileDecrypt = scanner.nextLine();

        // Prompt user for output file name for decryption
        System.out.print("Enter the output file name for decrypted data: ");
        String outputFileDecrypt = scanner.nextLine();

        decryptFile(inputFileDecrypt, outputFileDecrypt);
        scanner.close();
    }

      // Method to decrpyt a file by minusing 5 to each byte
      public static void decryptFile(String inputFile, String outputFile) {
        try (FileInputStream input = new FileInputStream(inputFile);
             FileOutputStream output = new FileOutputStream(outputFile)) { 
            
            // Read values from the file 
            int value;
            while ((value = input.read()) != - 1)
                output.write(value - 5);
            System.out.print("Encrptyed Value output: " + value + " ");

        // Exception Error catch
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
