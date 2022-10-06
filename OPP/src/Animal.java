public class Animal {
    // Att.(variables)
    // Object level -- non-static
    public String color;
    public String name;
    private int age;
    private int anger;// anger level 1-5

    // Static att
    static int counter = 0;

    // Constructor
    public Animal() {
        counter = counter + 1;
        // Animal.counter= Animal.counter+1; //they are the same since we have
        // no conflict of the name //static name uses class
        name = "";// I could use the dot or not
        color = "";
        anger = 1; // private
        age = 0;
    }

    public Animal(String name, String color, int age, int anger) {
        // conflic of names
        this.name = name;
        this.color = color;
        this.anger = anger; // private
        // for age I can use my build in method
        this.setAge(age); // I already code the checks so I am lazy to check if age is positive
        counter = counter + 1;

    }

    // methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // checking if age is a positive number otherwise set it to zero
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAnger() {
        return anger;
    }

    public void myPrint() {
        System.out.println("-----------------\nName:" + this.name + "\nColor: " + this.color + "\nThe age: " + this.age
                + "\nAnger level: " + this.anger + "\n-----------------");

    }
}
