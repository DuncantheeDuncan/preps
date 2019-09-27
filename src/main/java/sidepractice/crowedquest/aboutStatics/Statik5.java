package sidepractice.crowedquest.aboutStatics;

public class Statik5 {



        public static int counter = 0;

        public void count() {
            counter++;
        }

        public static void main(String[] args) {
            Statik statik = new Statik();
            statik.count();                     // line 12
//            count();                            // line 13
            statik.count();                     // line 14
            System.out.print(counter);          // line 15
            Statik.count();                     // line 16
            System.out.print(Statik.counter);   // line 17
            System.out.print(counter);          // line 18
            System.out.println(statik.counter); // line 19
        }
}
