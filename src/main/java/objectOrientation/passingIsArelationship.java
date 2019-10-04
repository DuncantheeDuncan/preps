package objectOrientation;
abstract class Animal{}
class Dog extends Animal{
    public void whatisMyName(String s){

        System.out.println(s + " That's your name..(-|-)");
    }
}
public class passingIsArelationship extends  Dog{

    public Animal go(String s){

        whatisMyName(s);
        
        return new Dog();
    }

    public static void main(String[] args) {

        passingIsArelationship p = new passingIsArelationship();
        p.go("Mr Duncan sir");


    }

}
