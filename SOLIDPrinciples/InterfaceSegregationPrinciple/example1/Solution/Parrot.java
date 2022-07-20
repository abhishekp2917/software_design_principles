package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Solution;

/* 
    Parrot class implements FlyableAnimal interface since cats can't swim
    Hence there is no need to provide implementation for swim method
*/
public class Parrot implements FlyableAnimal {
    
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
}
