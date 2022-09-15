import java.util.Scanner;  // Import the Scanner class

public class Game {
    public static void main(String[] args) {

    Scanner myScn = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter an Int");

    int mychoice = myScn.nextInt();  // Read user input
    System.out.println("my Int  is: " + mychoice);  // Output user input
    }

}
