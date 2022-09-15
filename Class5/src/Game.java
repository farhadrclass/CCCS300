import java.util.Scanner; // Import the Scanner class

public class Game {
    public static void main(String[] args) {

        Scanner myScn = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter an Int");

        int userInput = myScn.nextInt(); // Read user input
        int numTry = 0;
        int answer = 12;
        while (numTry < 4 ) {
            System.out.println("your anwer is Int  is: " + userInput); // Output user input
            if (answer == userInput) {
                break;
            }
            numTry++;
            System.out.println("Wrong, please try agian");
            userInput = myScn.nextInt();
        }
        if (numTry < 5) {
            System.out.println("WINNER");
        } else {
            System.out.println("Loser");
        }
    }

}
