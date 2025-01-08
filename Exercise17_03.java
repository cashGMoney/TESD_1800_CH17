import java.io.*;
import java.util.Random;

public class Exercise17_03 {
    public static void main(String[] args) throws IOException {
        // Create File path
        String filePath = "C:\\Users\\cashg\\OneDrive\\Desktop\\TESD_1400\\Projects\\Exercise17_03.dat";

        // Write 100 integers created randomly into the file using writeInt(int) in DataOutputStream
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(filePath, true))) {
            Random random = new Random();

            // Generate and write 100 random integers
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(100) + 1;
                output.writeInt(randomNumber);
            }
        }

        // Reading and displaying the integers from the file
        try (DataInputStream input = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Integers in the file:");

			// Variable to store the sum of integers
			int sum = 0; 

            // Loop to read and display the integers
            while (input.available() > 0) {

				// Read the integer
                int value = input.readInt(); 

				// Print the value
                System.out.print(value + " "); 

				// Use sum += to add add values
				sum += value; 
            }

            // Write a method that reads the integers from the file and finds the sum of the integers
            System.out.println("\nSum of integers: " + sum);
        }
    }
}





/* -----Unused Code for refrences------

			// Clear the file to destroy the old contents if exists
			inout.setLength(0); 

			// Display the current length of the file 
			System.out.println("Current file length is " + inout.length());

			// Retrieve the first number 
			inout.seek(0); // Move the file pointer to the beginning 
			System.out.println("The first number is " + inout.readInt());

			// Retrieve the second number 
			inout.seek(1 * 4); // Move the file pointer to the second number 
			System.out.println("The second number is " + inout.readInt());

			// Retrieve the tenth number 
			inout.seek(9 * 4); // Move the file pointer to the tenth number 
			System.out.println("The tenth number is " + inout.readInt());

			// Modify the eleventh number 
			inout.writeInt(555); 

			 

			// Display the new length 
			System.out.println("The new length is " + inout.length());

			// Retrieve the new eleventh number 
			inout.seek(10 * 4); // Move the file pointer to the eleventh number
			System.out.println("The eleventh number is " + inout.readInt());


 */