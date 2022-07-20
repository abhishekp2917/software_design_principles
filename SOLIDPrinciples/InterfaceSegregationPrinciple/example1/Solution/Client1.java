package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Solution;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating cat object which is not flyable
        NonFlyableAnimal cat = new Cat();

        // creating parrot object which is flyable
        FlyableAnimal parrot = new Parrot();

        System.out.println("\n_____________Animals eating food______________\n");
        cat.eat();
        parrot.eat();

        System.out.println("\n_____________Animals speaking______________\n");
        cat.speak();
        parrot.speak();

        System.out.println("\n_____________Animals flying______________\n");
        parrot.fly();
        // cats can't fly and thus there is no such method for cat

        System.out.println("\n_____________Animals swimming______________\n");
        cat.swim();
        // parrots can't swim and thus there is no such method for parrot
    }
}
