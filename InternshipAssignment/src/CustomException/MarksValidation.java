package CustomException;

import java.util.Scanner;

class InvalidMarksException extends Exception {

	public InvalidMarksException(String message) {
        super(message);
    }
}

public class MarksValidation {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks in percentage: ");
            double marks = sc.nextDouble();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Error: Marks must be between 0% and 100%.");
            }

            System.out.println("You entered: " + marks + "%");

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            sc.close();
        }
    }
}
