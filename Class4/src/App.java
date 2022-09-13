public class App {

   //value 
   static int i=1000;
   static int j =-9;
   
   
    public static void myFunMethod(int i) {
        System.out.println("My Value for i:\t "+i); // This is local i, 
        System.out.println("My Value for i in class:\t "+App.i); // This is class i, 
        System.out.println("My Value for j:\t "+j); //  no local j so it will select class level j

    }
   
    // TODO talk aboout class/ local variable
    /**
     * 
     */
    public static void myFirstMethod() {
        System.out.println("Name:\t Farhad");

        System.out.println("Sport:\t Waterpolo");
    }

    public static void myWinner(int i,int j) {
        if (i*j >= 5) { //i*j
            System.out.println("Winner i,j input");
        } else {
            System.out.println("Better Luck next time,i,j");
        }
    }
    //overloading
    public static void myWinner(int i) {
        if (i >= 5) { //just i
            System.out.println("Winner");
        } else {
            System.out.println("Better Luck next time");
        }
    }

    // Method 2
    public static void myWinner2(int i) {
        if (i >= 5) {
            System.out.println("Winner");
            return;
        }
        System.out.println("Better Luck next time");
    }



    public static void main(String[] args) throws Exception {
        myFirstMethod();
        // Testing i <5
        myWinner(4);
        // Testing when i > 5
        myWinner(6);
        // Testing when i = 5
        myWinner(5);
        myWinner(5,6);
        myWinner(5,-1);

        myFunMethod(4);
        double myArea = areaCal(3.3);
        System.out.println("Area is \t"+myArea);

    }

    public static double areaCal(double radius) {
        return Math.PI * Math.pow(radius, 2.0);
    }

}
