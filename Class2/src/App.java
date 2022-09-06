public class App {
    static String today = "Not Tuesday"; // Class Level variables -- Use of Static keyword

    /*
     * This method does /.....
     * 
     * Input 
     * Output 
     */
    public static void main(String[] args) {
        
        //Should have a check to see if args is empthy -- how to do it homework
        System.out.println("My arg is "+args[0]);
        
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
        System.out.println("question 2 is " + questionTwo());  
        System.out.println("question 3 is ");
        questionThere();  

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

        /**
     * This is the solution to question 2
     * @return doube , the sol of the equ.
     */
    public static double questionTwo(){
        // // Declaring variable
        double fx;
        
        fx = 6 / 2 * (1+2) ;
        

        return fx;
        // return 6 / 2 * (1+2) ;
    }
    public static void  questionThere(){
        // // Declaring variable
        int half = 1/2; //This doesn't give me error , becuase it first div and save it as int 0
        // int half = 0.5; //This gives me error 
        // double x =  1/2;
        double x = (double) 1/2 + 1/2;

        double y =  1.0/2;


        int one = half + half;
        System.out.println(half +" and one is "+one+" and the x is "+x+" and the y is "+y);
        System.out.println( 2 + 3 + "5");
        System.out.println( "5" + 3 + 2);

        // return 6 / 2 * (1+2) ;
    }
}
