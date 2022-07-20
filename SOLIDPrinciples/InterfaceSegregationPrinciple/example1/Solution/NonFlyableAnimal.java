package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Solution;

/* 
    NonFlyableAnimal interface extends Animal interface and has swim method

    This way we can segregate the Animal interface so that animals that don't need
    some methods won't be forced to provide implementation for it 
*/
public interface NonFlyableAnimal extends Animal {
    
    public void swim();
}
