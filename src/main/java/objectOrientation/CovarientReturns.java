package objectOrientation;

class Cverant{
    Cverant myname(){
        System.out.println("My NAme is ");
        return new Cverant();
    }
}
public class CovarientReturns extends Cverant{

    CovarientReturns myname(){
        System.out.println("my name is phumlani");
        return new CovarientReturns();
    }

    public static void main(String[] args) {


        Cverant j = new Cverant();
        j.myname();

        j.myname();
    }
}
