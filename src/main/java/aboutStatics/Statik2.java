package aboutStatics;

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

        System.out.print(statik2.getCounterTwo());  // line 30
        System.out.print(getCounterOne());  // line 31
        System.out.print(statik1.getCounterOne());  // line 31
        System.out.print(Statik2.getCounterOne());  // line 31

    }
}

/*
* public class Statik {

    public static int counter = 0;

    public static void count() {
        counter++;
    }

    public static void main(String[] args) {
        Statik statik = new Statik();
        Statik.count();                    // line 12
        count();                           // line 13
        statik.count();                    // line 14
        System.out.print(counter);         // line 15
        Statik.count();                    // line 16
        System.out.print(Statik.counter);  // line 17
        System.out.print(counter);         // line 18
        System.out.println(statik.counter); // line 19
    }
}*/


/*
* public class Statik {

    public  int counter = 0;

    public static void count() {
        counter++;                  // line 7
    }

    public static void main(String[] args) {
        Statik.count();                     // line 12
        count();                            // line 13
        System.out.print(counter);         // line 14
        Statik.count();                    // line 15
        System.out.print(Statik.counter);  // line 16
        System.out.print(counter);         // line 17
    }
}*/

/*
* public class Statik {

    public static int counter = 0;

    public void count() {
        counter++;
    }

    public static void main(String[] args) {
        Statik statik = new Statik();
        statik.count();                     // line 12
        count();                            // line 13
        statik.count();                     // line 14
        System.out.print(counter);          // line 15
        Statik.count();                     // line 16
        System.out.print(Statik.counter);   // line 17
        System.out.print(counter);          // line 18
        System.out.println(statik.counter); // line 19
    }
}*/

