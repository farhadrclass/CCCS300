import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        // Animal myCat = new Animal();
        // myCat.color= "yellow";
        // myCat.name = "Rex";
        // // myCat.age //this is a priavte value
        // myCat.setAge(10);

        // // Animal.counter = 100; //static
        // System.out.println("myCat is "+myCat.name+" Color is "+ myCat.color+" The age is "+myCat.getAge());

        //From new 
        Animal myDog = new Animal("Scooby","grey",10,1);
        myDog.myPrint();
        System.out.println("Animal Counter "+ Animal.counter);

        

        Animal myCat = new Animal("Tom","gery",2,5);
        myCat.myPrint();

        System.out.println("Animal Counter "+ Animal.counter);

        myDog.counter = 100; //class level attribute
        System.out.println("Animal Counter "+ myCat.counter);


        System.out.println(myCat);
        System.out.println(myCat.toString());
// 



    }
}
