package objectOrientation;

class  Animals{}
class Horse extends Animals{}

class UseAnimals {

    public void doStuff(Animals a){

        System.out.println("IN the Animal Version");
    }
    public void doStuff(Horse h){
        System.out.println("In the version of Horse");
    }
}
public class AnimalWithmethodsUsingRefVar {

    public static void main(String[] args) {

        UseAnimals useAnimals = new UseAnimals();
        Animals animal = new Animals();

        Horse horse = new Horse();
        Animals aa = new Horse();


        useAnimals.doStuff(animal);
    }

}
