public class App {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        myMethod(x, y);
        System.out.println(x + " " + y);

        int count = 36;
        while (count > 0) {
            if (count >= 100) {
                System.out.println(count + "\t is TOO LARGE");
                break;
            } else if (count >= 20) {
                System.out.println(count + "\t Need to be fixed to 10");
                count -= 10;
                continue;
            }
            System.out.print(count + "\t");
            count -= 2;
        }
        // this is outside the loop
        System.out.println("YAAAY I am free");

        // int i =10;
        for (int i = 10; i < 20; i++) {
            System.out.println("For Loop i= " + i);

        }
        // System.out.println("For Loop i= "+i); //i does not exisit here!!
        // for(;;){

        // }

        for (int i = 0; i <= 10; i++) {
            System.out.print("|");

            for (int j = 0; j <= 5; j++) {
                System.out.print(i + "-" + j+"|");
            }
            System.out.println("\n----------------------------------");
        }

        count =100;
        do{
            System.out.println(count);
            count++;
        }while(count<102);

    }

    public static void myMethod(int x, int y) {
        x = y;
        y = x;
    }

}
