package BasicDesignPrinciples.CompositionOverInheritance.example1.Solution;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating duck object
        Duck duck = new Duck("Yamagami");
        // creating sub-classess of duck object
        Duck mountainDuck = new MountainDuck("Yankee");
        Duck cityDuck = new CityDuck("Metthu");
        // creating ToyDuck object
        Toy toyDuck = new ToyDuck("Kanzee");

        System.out.println("\n_________Ducks eating food____________\n");
        duck.eat();
        mountainDuck.eat();
        cityDuck.eat();
        // toy duck can't eat
        
        System.out.println("\n_________Ducks speaking____________\n");
        duck.speak();
        mountainDuck.speak();
        cityDuck.speak();
        // toy duck speak just like other duck 
        toyDuck.speak();
        

        System.out.println("\n_________Ducks flying_____________\n");
        duck.fly();
        mountainDuck.fly();
        cityDuck.fly();
        // toy duck can't fly
    }
}
