package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Problem;

/* 
    Parrot class implements Animal interface and provide concrete implementation for 
    each inherited methods
*/
public class Parrot implements Animal {
    
    // method to eat for parrot
    @Override
    public void eat() {
        System.out.println("Parrot eats chilli");
    }

    // method to fly for parrot
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    // method to speak for parrot
    @Override
    public void speak() {
        System.out.println("Parrot speaks like human");
    }
    
    // parrots can't swim and thus this method gives an Exception
    @Override
    public void swim() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Parrots can't swim");
    }
}
