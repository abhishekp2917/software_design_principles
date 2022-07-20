package BasicDesignPrinciples.CompositionOverInheritance.example1.Solution;

/* 
    Duck class which can eat, speak and fly
*/
public class Duck {

    private String name;
    
    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // method to eat
    public void eat() {
        System.out.println("Duck named " + this.name + " eats insects");
    }

    // method to speak
    public void speak() {
        System.out.println("Duck named  " + this.name + " speaks Quack...Quack...");
    }

    // method to fly
    public void fly() {
        System.out.println("Duck named " + this.name + " flying");
    }
}
