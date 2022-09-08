public class ProPlayer {
    public static void main(String[] args) throws Exception {

        // Variables an holders for args

        /*
         * BEFORE:  I had no idea
         * Resourse :  wiki.com
         * After:  I notice  can se this to do string to int and I modify it to the following code 
         */

        int age = Integer.parseInt(args[0]);
        
        String name = args[1];
        double m = Double.parseDouble(args[2]);

        // place holder for printing variables
        String proStatus, sport;

        // if (age >= 0 && age < 10){
        // proStatus = "youth";
        // }
        // else if (age >= 10 && age < 30){
        // proStatus = "Pro";
        // }
        // else {
        // proStatus = "Coach";
        // }
        // Method 2 : use methods
        proStatus = myStatus(age);

        //The reason that I didn't check the values for 2<= is that it is included in first if 
        if (m >= 0 && m < 2) {
            sport = "Football";
        } else if (m < 5) {
            sport = "Vball";
        } else if (m < 6) {
            sport = "Tennis";
        } else {
            sport = "basketball";
        }

        System.out.println("Hi " + name + " you should play " + sport + " and your level is " + proStatus);
    }

    private static String myStatus(int age) {
        if (age >= 0 && age < 10) {
            return "youth";
        } else if (age >= 10 && age < 30) {
            return "Pro";
        } else {
            return "Coach";
        }
    }

}
