public class HomeWork {
    public static void myRev(int[] myArr) {
        int buffer=0;
        int mySize = myArr.length;
        for (int i = 0; i < (mySize/2); i++){  // (mySize/2) is an int divide so middle is ignored in odd
            buffer = myArr[i];
            myArr[i] = myArr[mySize-i-1];
            myArr[mySize-i-1]= buffer;
        }   
    }

    private static String myPrinter(int[] myArr) {
        String s = "";
        for (int i = 0; i < myArr.length; i++)
            s = s  + myArr[i]+",";
        return s;
    }

    public static void main(String[] args) {
        int[] myArr = { 11, 4, 2, 3, -4, -9 };
        System.out.println(myPrinter(myArr));

        myRev(myArr);
        System.out.println(myPrinter(myArr));

    }

}
