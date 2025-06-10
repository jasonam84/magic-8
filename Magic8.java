import java.util.Random;
// This program simulates a Magic 8 Ball game where the user can ask a yes or no question
// and the program will respond with a random answer from a predefined set of responses.
// The user is prompted to enter a question, and the program generates a random number
// between 1 and 10 to determine the response.
// The responses are printed based on the generated number, simulating the behavior of a Magic 8 Ball. 
import java.util.Scanner;

public class Magic8 {
    public static void main (String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int MaxRange = 10;

        System.out.println("Welcome to the Magic 8 Ball Game!!!!!");
        System.out.println("Ask a yes or no question.");
        String question = scanner.nextLine();

        int newNumber = random.nextInt(MaxRange - minRange + 1) + minRange;
        System.out.println("Enter your question: ");
        System.out.println("Your question was: " + question);
        System.out.println("The Magic 8 Ball says: " + newNumber);


        switch(newNumber) {
            case 1:
                System.out.println("Yes.");
                break;
            case 2:
                System.out.println("It is so.");
                break;
            case 3:
                System.out.println("It is not at all so.");
                break;
            case 4:
                System.out.println("Not At all!");
                break;
            case 5:
                System.out.println("You may rely on it.");
                break;
            case 6:
                System.out.println("It is DECIDEDLY So.");
                break;
            case 7:
                System.out.println("Yes.");
                break;
            case 8:
                System.out.println("No.");
                break;
            case 9:
                System.out.println("Ask again later.");
                break;
            case 10:
                System.out.println("Cannot predict now.");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
