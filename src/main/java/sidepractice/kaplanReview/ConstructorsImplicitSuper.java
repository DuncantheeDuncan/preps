package sidepractice.kaplanReview;

class BeforeOneOfTheKind{
    BeforeOneOfTheKind(){

        System.out.println(" i am before so im printing first ");
    }
    void four(){}
}

class OneOfTheKind extends BeforeOneOfTheKind{
OneOfTheKind(){
    System.out.println("im gonna print first..");

}
 OneOfTheKind(String s){
    System.out.println("string "+ s);
}


void four(){
    System.out.println("four in super");
}
}
class SecondOfTheKind extends OneOfTheKind{

    SecondOfTheKind(){
//        super();
        System.out.println("am i gonna print second?");

    }
    SecondOfTheKind(int d){
//     super("String for int");
        super();
        System.out.println(d + " Before");

        System.out.println("number "+ d);

        System.out.println(d + " after");

    }
    void four(){
        System.out.println("four in sub");
    }
}
public class ConstructorsImplicitSuper extends SecondOfTheKind {

    public static void main(String[] args) {

        BeforeOneOfTheKind on = new SecondOfTheKind(3);
        on.four();



    }
}
