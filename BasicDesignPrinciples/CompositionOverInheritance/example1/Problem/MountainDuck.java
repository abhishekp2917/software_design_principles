package BasicDesignPrinciples.CompositionOverInheritance.example1.Problem;

/* 
    MountainDuck class extends Duck class and overrides eat method
*/
public class MountainDuck extends Duck {

    public MountainDuck(String name) {
        super(name);
    }

    // overriding eat method
    @Override
    public void eat() {
        System.out.println("Mountain duck eats grains and insects");
    }    
}
