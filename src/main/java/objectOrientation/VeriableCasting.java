package objectOrientation;


class SomeClass extends SPecies {
    public void some() {
        System.out.println("some class");
    }
}
class SPecies {
    public void oneSpecies(){
        System.out.println("species");
    }
}

class Humans extends SPecies {
    public void twoHumans() {
        System.out.println("humans");
    }
}

class People extends Humans {
    public void threePeople() {
        System.out.println("people");
    }
//    public void oneSpecies(){
//        System.out.println("species in people");
//    }
}

public class VeriableCasting {
    void someMethod() {
        System.out.println("variable casting");
    }
    public static void main(String[] args) {

        SPecies sPecies = new SPecies();
        Humans humans = new Humans();
        People people = new People();
        SomeClass someClass = new SomeClass();

//        System.out.println(humans);

//        ((People)humans).oneSpecies();
        ((SPecies)humans).oneSpecies();





        }


}
