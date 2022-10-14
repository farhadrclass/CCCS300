public class App {
    public static void main(String[] args) throws Exception {
        Animal myDog = new Animal(12,"blue",2);
        Cat myCat = new Cat();
        Cat myCatWName = new Cat("Blue",2,"Tom");
        System.out.println(myCatWName.name+" "+ myCatWName.color);



        Animal myPet = new Cat();

        myCat.cutness =12;

        myDog.printCute();
        myCat.printCute();
        myDog.eat();
        myCat.eat();
        // myPet.eat();
    }
}
