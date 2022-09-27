import java.util.Arrays;

public class MyArrClass {
    public static void main(String[] args) {
        double[] x = { 12, 2, 2, 3 };
        double[] y = x; // passing by reference
        double[] z = x.clone();// Copy the whole reference
        z[1] = 100;
        y[0] = 4;
        System.out.println(x[0] + " " + y[0]);
        System.out.println(x[1] + " " + y[1] + " " + z[1]);

        // Print the address not the value
        System.out.println("Print the address not the value");

        System.out.println("X: " + x + " Y: " + y + " Z: " + z);

        int[] blank = null;
        // System.out.println(blank.length);
        System.out.println(blank); // This prints null, accessing the address
        // System.out.println(blank[0]);//going to the address therefore..error
        testInt();
        testString();
        String s = "word";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                // s.charAt(i) = 'a';// it doesnot let me change the char
                System.out.println("TEST");
            }
        }
        System.out.println(s);

    }

    public static void testInt() {
        int[] x = { 10, 20, 30, 40 };
        myMethod(x);
        System.out.println(Arrays.toString(x));
    }

    public static void myMethod(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    public static void testString() {
        String s = "word";
        myMethodString(s);
        System.out.println("s is still point to" + s);
    }

    public static void myMethodString(String t) {
        t = t + "HAHA";
        System.out.println("t is pointg to " + t); // t is point to something else

    }

}
