package sidepractice.crowedquest.aboutStatics;

public class Statik4 {



        public  int counter = 0;

        public static void count() {
//            counter++;                  // line 7
        }

        public static void main(String[] args) {
            Statik.count();                     // line 12
            count();                            // line 13
//            System.out.print(counter);         // line 14
            Statik.count();                    // line 15
            System.out.print(Statik.counter);  // line 16
//            System.out.print(counter);         // line 17
        }
}
