import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner ScnObj = new Scanner(System.in);
        int userVal, sum = 0;
        do{
            System.out.println("What is your number");
            userVal=ScnObj.nextInt();
            if(userVal>9 || userVal < 0){
                System.out.println("only between 0-9");
                continue;
            }
            sum += userVal;
        }while(sum<100);

        System.out.println("The sum is : "+sum);

        ScnObj.close();
    }
}
