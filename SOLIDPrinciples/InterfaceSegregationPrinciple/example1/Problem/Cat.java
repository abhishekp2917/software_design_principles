package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Problem;

/* 
    Cat class implements Animal interface and provide concrete implementation for 
    each inherited methods
*/
public class Cat implements Animal {

    // method to eat for cat
    @Override
    public void eat() {
        System.out.println("Cat eats mouse");
    }

    // cats can't fly and thus this method gives an Exception
    @Override
    public void fly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cats can't fly");
    }

    // method to speak for cat
    @Override
    public void speak() {
        System.out.println("Cat speaks meow...meow...");
    }

    // method to swim for cat
    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }
}
