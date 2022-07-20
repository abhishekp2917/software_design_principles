package SOLIDPrinciples.LiskovSubstitutionPrinciple.example1.Solution;

/* 
    ToyDuck implements Toy interface and implements speak method

    Here ToyDuck class uses Duck class speak feature to implemented own speak method
    Rather than inheriting this feature, it uses composition to access the speak 
    method of Duck class
*/
public class ToyDuck implements Toy {
    
    private Duck duck;
    private String name;

    public ToyDuck(String name) {
        this.name = name;
        this.duck = new Duck(name);
    }

    public String getName() {
        return name;
    }

    // method to speak using Duck class speak method
    public void speak() {
        this.duck.speak();
    }
}
