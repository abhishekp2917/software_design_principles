package BasicDesignPrinciples.CompositionOverInheritance.example1.Problem;

/* 
    ToyDuck class extends Duck class

    ToyDuck is not a Duck but to get speak functionality of duck we inherit Duck 
    class in ToyDuck class.

    But by doing so we are violating Liskov Substituiton principle as it gives 
    Exception for eat and fly method since this class doesn't need these methods
*/
public class ToyDuck extends Duck {
    
    public ToyDuck(String name) {
        super(name);
    }

    // toy duck can't eat and thus give Exception
    @Override
    public void eat() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    // toy duck can't fly and thus give Exception
    @Override
    public void fly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
