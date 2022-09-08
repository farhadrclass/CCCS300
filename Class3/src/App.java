public class App {
    public static void main(String[] args) throws Exception {
        // TODO put condition on args
        // double priceChicken = 7.71;
        // double priceBeef = 16.92;
        double priceChicken = Double.parseDouble(args[0]);
        double priceBeef = Double.parseDouble(args[1]);
        boolean isChickenCheaper = priceChicken < priceBeef;
        System.out.println("Chicken costs " + priceChicken + " dollars per kg.");
        System.out.println("Chicken is cheaper than beef: " + isChickenCheaper);

        // code to check args 3 is even or odd
        evenCheck(args[2]);
        evenCheckWay2(args[2]);

    }

    private static void evenCheck(String str) {
        int myVal = Integer.parseInt(str);
        if (myVal % 2 == 0) {
            System.out.println(myVal + " is an even number: true");
        } else {
            System.out.println(myVal + " is an even number: false");

        }
    }

    private static void evenCheckWay2(String str) {
        int myVal = Integer.parseInt(str);
        System.out.println(myVal + " is an even number: " + (myVal % 2 == 0));

    }

}
