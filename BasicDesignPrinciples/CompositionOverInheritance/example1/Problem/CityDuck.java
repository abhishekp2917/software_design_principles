package BasicDesignPrinciples.CompositionOverInheritance.example1.Problem;

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
        System.out.println("City duck eats grains");
    }
}
