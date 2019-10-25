package sidepractice.kaplanReview;


abstract class Cat {

    public void show() {
        System.out.println("cat");
    }
}
 class Monkey extends Cat{


    public void show() {
        System.out.println("monkey");
    }
}
interface  oe {

}

class Snake extends  Monkey {


    public void show() {
        System.out.println("Snakes");
    }
}
public class PolymorphicClasses extends  Snake{

    public void show(){
        System.out.println("in main");
    }
    public static void main(String[] args) {

        Cat cat1,cat2,cat3;
        cat1 = new Snake();
        cat2 = new Monkey();
        cat3 = new PolymorphicClasses();

        cat1.show();
        cat2.show();
        cat3.show();


    }
}
