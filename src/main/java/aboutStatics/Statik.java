package aboutStatics;


public class Statik {

    public static int counter = 0;

    public static void count() {
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("* * * *  **  *STATIC ONE* * * * * * ");
        count();
        count();
        count();
        Statik.count();
        System.out.print(counter);
        Statik.count();
        Statik.count();

        System.out.println(Statik.counter);

    }
}

