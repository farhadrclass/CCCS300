public class Cat extends Animal{
    public String name;
    public Cat(){}
    public Cat(String color,int cutness,String name){
        super(color,cutness);
        System.out.println("I am the Cat");
        // this.color = color;
        // this.cutness = cutness;
        this.name = name;

    }
	public void eat(){
        super.eat();
		System.out.println("Yes human feed me now");
	} 
}
