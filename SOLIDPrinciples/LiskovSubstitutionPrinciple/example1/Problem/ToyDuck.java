package SOLIDPrinciples.LiskovSubstitutionPrinciple.example1.Problem;

/* 
    ToyDuck class extends Duck class

    It gives Exception for eat and fly method since this class doesn't need these 
    methods and thus it violates Liskov Substituiton principle
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
