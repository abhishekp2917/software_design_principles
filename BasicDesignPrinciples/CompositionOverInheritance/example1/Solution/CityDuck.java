package BasicDesignPrinciples.CompositionOverInheritance.example1.Solution;

/* 
    CityDuck class extends Duck class and overrides eat method
*/
public class CityDuck extends Duck {
    
    public CityDuck(String name) {
        super(name);
    }

    // overriding eat method
    @Override
    public void eat() {
        System.out.println("City duck named " + this.getName() + " eats grains");
    }
}
