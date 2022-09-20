
import java.util.Scanner;

public class NewFriends {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner read = new Scanner(System.in);

        System.out.println("What's your name? ");
        name = read.nextLine();
        System.out.println("How old are you?\n ");
        age = read.nextInt();

        System.out.println(name + " is " + age + " years old.");
        System.out.print("X: ");

        read.nextLine();// to avoid getting empty x, we need a scanner to scan for space produce by print

        String x = read.nextLine();
        System.out.print("Y: ");
        String y = read.nextLine();
        System.out.print("X: "+ x +"  and y "+y);

    }
}
