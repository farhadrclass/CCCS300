public class App {
    static String today = "Not Tuesday"; // Class Level variables -- Use of Static keyword

    /*
     * This method does /.....
     * 
     * Input 
     * Output 
     */
    public static void main(String[] args) {
        //Declarting Variables:
        // Declatring variables from Page 12 of notes of week 2
        String today;// Local variable today
        int hour = 10;
        // int date = "Sept"; //Error here, it expect int not String

        // Init my variables 
        today = "Tues"; // Init today variable to Tuesday
        // Alternative method is : // String today = "Wed"; //you can not redeclare a
        // variable

        System.out.println("Today is " + App.today + "\nmy int is " + hour); // Class level today
        System.out.println("Today is " + today + "\nmy int is " + hour); // method level variable of today

        System.out.println("question one is " + questionOne(3, 9.7));  //outside the class you need the name of the class : App.questionOne(x, g)
    }

    /**
     * This is the solution to wierd equation on the board
     * @param x int, my x....
     * @param g double, my ground speed
     * @return doube , the sol of the equ.
     */
    public static double questionOne(int x, double g){
        // // Declaring variable
        double fx;
        // int x=12;
        // double g=9.8;

        //wierd equation
        fx = 50*x + g*100+ x*x + x*x*x ;

        if (fx%2 == 0){
            fx=0;
        }
        else if(fx%3 == 0){
            fx= 1;
        }
        return fx;
    }
}
