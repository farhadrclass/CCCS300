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

    }
}
