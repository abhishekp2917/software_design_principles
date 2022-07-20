package SOLIDPrinciples.LiskovSubstitutionPrinciple.example1.Problem;

/* 
    Duck class which can eat, speak and fly
*/
public class Duck {

    protected String name;
    
    public Duck(String name) {
        this.name = name;
    }

    // method to eat
    public void eat() {
        System.out.println("Duck eats insects");
    }

    // method to speak
    public void speak() {
        System.out.println("Quack...Quack...");
    }

    // method to fly
    public void fly() {
        System.out.println("Duck flying");
    }
}
