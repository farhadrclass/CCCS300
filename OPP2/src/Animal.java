public class Animal {
	private int age; 
    public String color;
    public int cutness; //if 1 ugly, if 5 super cute 
	
    //Const.
    public Animal(){}
    public Animal( String color, int cutness){
        System.out.println("I am the ANimal");
        this.color = color;
        this.cutness = cutness;//you can here check if it is 1-5
    }

    public Animal(int age, String color, int cutness){
        this.age = age;
        this.color = color;
        this.cutness = cutness;//you can here check if it is 1-5
    }

    public void printCute(){
        System.out.println(this.cutness);
    }
	public void eat(){
		System.out.println("Nom, nom, nom.");
	} 


	public int getAge() {
		return this.age;
	}
}
