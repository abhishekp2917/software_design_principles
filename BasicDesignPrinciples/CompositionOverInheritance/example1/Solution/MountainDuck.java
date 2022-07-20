package BasicDesignPrinciples.CompositionOverInheritance.example1.Solution;

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
        System.out.println("Mountain duck named " + this.getName() + " eats grains and insects");
    }    
}
