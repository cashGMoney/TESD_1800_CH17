import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);

        // Write the Loan objects to the file
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"))) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        } catch (IOException ex) {
            System.out.println("File could not be opened");
        }

        // Use the outputData function to write to the file
        outputData("Exercise17_07.dat");
    }

    // A void function called outputData that reads the Loan objects from the file and displays the total loan amount. 
    public static void outputData(String fileName) {

        // Variable for totalLoanAmount
        double totalAmount = 0;

        // Run a Loop for the Read Object
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) { 
                Loan loan = (Loan) input.readObject(); 
                
                // Add the sums of the loan amount for each loop
                totalAmount += loan.getLoanAmount(); 
            }
            
        // Suppose you don’t know how many Loan objects are there in the file, use EOFException to end the loop.
        } catch (EOFException ex) {

            // Display total loan amount
            System.out.println("Total Loan Amount: " + totalAmount);

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

