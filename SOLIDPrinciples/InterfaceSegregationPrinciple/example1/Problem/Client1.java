package SOLIDPrinciples.InterfaceSegregationPrinciple.example1.Problem;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating cat object
        Animal cat = new Cat();

        // creating parrot object
        Animal parrot = new Parrot();

        System.out.println("\n_____________Animals eating food______________\n");
        cat.eat();
        parrot.eat();

        System.out.println("\n_____________Animals speaking______________\n");
        cat.speak();
        parrot.speak();

        System.out.println("\n_____________Animals flying______________\n");
        // cats can't fly 
        try{
            cat.fly();
        }
        catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        parrot.fly();

        System.out.println("\n_____________Animals swimming______________\n");
        cat.swim();
        // parrots can't swim
        try{
            parrot.swim();
        }
        catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
