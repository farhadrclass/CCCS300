public class App {
    static String today="Not Tuesday"; //Class Level variables -- Use of Static keyword
    public static void main(String[] args) {
        //Declatring variables from Page 12 of notes of week 2 
        String today;// Local variable  today 
        int hour=10;
            // int date = "Sept"; //Error here, it expect int not String



        today = "Tues";  // Init today variable  to Tuesday
        // Alternative method is : // String  today = "Wed"; //you can not redeclare a variable

        
        System.out.println("Today is "+ App.today+"\nmy int is "+hour); // Class level today
        System.out.println("Today is "+ today+"\nmy int is "+hour); // method level variable of today 
    }
}
