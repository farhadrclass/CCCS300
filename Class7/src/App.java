public class App {
    public static void main(String[] args) {
        int[] myArr = { 11, 4, 2, 3, 6, -4, -9 };
        int minVal = Integer.MAX_VALUE; // I need the largest value in Int java
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] <= minVal) {// updatin my minVal based on value in the array
                minVal = myArr[i];
            }
            System.out.println("i:" + i + " val: " + myArr[i] + " MinVal = " + minVal);
        }
        System.out.println("Final  MinVal = " + minVal);
    }
}
