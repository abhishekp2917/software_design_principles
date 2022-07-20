package SOLIDPrinciples.LiskovSubstitutionPrinciple.example1.Problem;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating duck object
        Duck duck = new Duck("Yamagami");
        // creating sub-classess of duck object
        Duck mountainDuck = new MountainDuck("Yankee");
        Duck cityDuck = new CityDuck("Metthu");
        Duck toyDuck = new ToyDuck("Kanzee");

        System.out.println("\n_________Ducks eating food____________\n");
        duck.eat();
        mountainDuck.eat();
        cityDuck.eat();
        // ToyDuck can't replace Duck object as it can't eat
        try{
            toyDuck.eat();
        }
        catch(UnsupportedOperationException e) {
            System.out.println("Toy Ducks can't eat");
        }
        
        System.out.println("\n_________Ducks speaking____________\n");
        duck.speak();
        mountainDuck.speak();
        cityDuck.speak();
        toyDuck.speak();
        

        System.out.println("\n_________Ducks flying_____________\n");
        duck.fly();
        mountainDuck.fly();
        cityDuck.fly();
        // ToyDuck can't replace Duck object as it can't fly
        try{
            toyDuck.fly();
        }
        catch(UnsupportedOperationException e) {
            System.out.println("Toy ducks can't fly");
        }
    }
}
