

public class mySample {
    public static void main(String[] args) throws Exception {
        // int sum = myRecursive(10);
        // System.out.println("my sum is \t" + sum);
        // String methods
        String inputStr = "Toronto";
        String myOut = myStrMethod(inputStr);

        System.out.println("Input:\t" + inputStr + "\tMy result is \t" + myOut);

        myCoolStr(inputStr, "ron");

    }

    /**
     * Check A and B relations 
     * @param A:  String
     * @param B:  String
     */
    public static void myCoolStr(String A, String B) {
        if (A.equalsIgnoreCase(B)) {
            System.out.println("They are the same String");
        } else if (A.contains(B)) {
            System.out.println("B in A");
        } else if (B.contains(A)) {
            System.out.println("A in B");
        } else {
            System.out.println("Not connected");
        }
    }

    /**
     * Takes a String , reerse it and return it, also print the char in reverse order
     * @param inputStr : String
     * @return String
     */
    public static String myStrMethod(String inputStr) {
        int len = inputStr.length();
        String A="";
        char  myChar;
        //loop  through the string and assign the value backward
        for (int i= len-1; i>=0 ;i--){
            myChar= inputStr.charAt(i);
            A += myChar;
            System.out.println(myChar);
        }
        System.out.println(A);
        return A;
    }

    /**
     * my recursive function to sum all positive int to int i
     * 
     * @param i
     * @return
     */
    public static int myRecursive(int i) {
        System.out.println("my i is \t" + i);
        if (i == 0) {
            return 0;
        }
        int sum = i + myRecursive(i - 1);

        System.out.println("my sum in the method is  \t" + sum);
        return sum;
    }
}
