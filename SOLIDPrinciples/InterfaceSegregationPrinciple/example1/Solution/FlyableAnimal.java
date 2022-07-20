package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Solution;

/* 
    FlyableAnimal interface extends Animal interface and has fly method
    
    This way we can segregate the Animal interface so that animals that don't need
    some methods won't be forced to provide implementation for it 
*/
public interface FlyableAnimal extends Animal {

    public void fly();
}
