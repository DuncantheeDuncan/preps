package objectOrientation;

class Species{
//    public void typeOfSpecies(){ System.out.println("Species"); }

//    protected void printYourSelf(){ System.out.print("print Species "); }

    public static void statikcheck(){ System.out.print("I am static SPECIES "); }
}

class Human extends Species{


//    public void typeOfSpecies(){ System.out.println("Human"); }
//    public void printYourSelf(){

//        System.out.print(" print 'I am Human ' ");
//        super.printYourSelf();
//    }
// TODO: if the keyword @override is implemented it will result into a compiler ERROR!!
//   @Override
    public static void statikcheck(){System.out.print(" Me too, I am static  HUMAN"); }

}

class Person extends Human{
//    public static void statikcheck(){ System.out.print("I am static PERSON "); }
//    public void printYourSelf(){
//        super.printYourSelf();
//        System.out.print(" print Person.");
//    }

//    public void yyy(){
//        System.out.println("qweety");
//    }
}

public class InheritableMethods {

    public static void main(String[] args) {

//        new Person().typeOfSpecies();

        Species s = new Person();
//        s.printYourSelf();
        System.out.println("\n* * * * * * * * * *");
//        s.typeOfSpecies();
//        System.out.println("\n* * * * * * * * * *");

        Person.statikcheck();

        System.out.println("\n* * * * * * * * * *");

//        inter.super.waiting();





    }

}

