package sidepractice.crowedquest.aboutStatics;

public class Statik2 {


    public static int counterOne = 0;
    public int counterTwo = 0;

    public Statik2() {
        counterOne++;               // line 9
        counterTwo++;               // line 10
    }

    public static int getCounterOne() {
        return counterOne;
    }

    public int getCounterTwo() {
        return counterTwo;


    }

    public static void main(String[] args) {

        Statik2 statik1 = new Statik2();
        Statik2 statik2 = new Statik2();
        Statik2 statik3 = new Statik2();
        Statik2 statik4 = new Statik2();
        Statik2 statik5 = new Statik2();
        Statik2 statik6 = new Statik2();

        System.out.print(statik2.getCounterTwo());
        System.out.print(getCounterOne());  // line 31
        System.out.print(statik1.getCounterOne());  // line 31
        System.out.print(Statik2.getCounterOne());  // line 31

    }
}

