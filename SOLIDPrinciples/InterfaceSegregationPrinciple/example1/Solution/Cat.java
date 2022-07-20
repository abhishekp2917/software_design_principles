package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Solution;

/* 
    Cat class implements NonFlyableAnimal interface since cats can't fly
    Hence there is no need to provide implementation for fly method
*/
public class Cat implements NonFlyableAnimal {

    // method to eat for cat
    @Override
    public void eat() {
        System.out.println("Cat eats mouse");
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
