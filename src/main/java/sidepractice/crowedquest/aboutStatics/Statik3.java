package sidepractice.crowedquest.aboutStatics;

public class Statik3 {


    public static int counter = 0;

    public static void count() {
        counter++;
    }

    public static void main(String[] args) {
        Statik statik3 = new Statik();
//        Statik.count();                    // line 12
        count();                           // line 13
        statik3.count();
        statik3.count();   // line 14
        System.out.print(statik3.counter);         // line 15
//        Statik3.count();                    // line 16
//        System.out.print(Statik.counter);  // line 17
        System.out.print(counter);         // line 18
//        System.out.println(statik.counter); // line 19

    }
}
