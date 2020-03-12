package sidepractice.kaplanReview;
interface Money{
    void fiveRand();
    void twoRand();
    void oneRand();
     String toString();
//     String one();
default void two(){
        System.out.println("default in interface");
//        return 8;
    }

    static void make(){
        System.out.println("i'm static");
    }
}

class TakesMoney implements Money{

    @Override
    public void fiveRand() {
        System.out.println("R5");

    }
    public String toString() {
        return "Super String 1";
    }

    public void two() {
        int one = 7;
        System.out.println("implemented default");
    }
static {
    System.out.println("sticking");
}
    @Override
    public void twoRand() {
        System.out.println("R2");

    }
    public void oneRand() {
        System.out.println("R1");


    }


}
class ExtendTakesMoney extends TakesMoney{
    @Override
    public void oneRand(){

        System.out.println("R1\nin another class");
    }
}
public class Implements {
    public static void main(String[] args) {

        Money money = new ExtendTakesMoney();

        money.fiveRand();
        money.oneRand();
        money.toString();
        money.two();

        TakesMoney takesMoney = new ExtendTakesMoney();

        takesMoney.two();

        System.out.println(money);


        Money.make();




    }
}
