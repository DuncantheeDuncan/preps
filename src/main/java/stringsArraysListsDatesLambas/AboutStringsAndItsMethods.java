package stringsArraysListsDatesLambas;

public class AboutStringsAndItsMethods {

   static void SUbstring(){

        String s ="123456789";

        System.out.println(s.substring(5,7));

       String anotherOne = "PHUMLANI";
       System.out.println(anotherOne.substring(2,6));

       String s2 = "0123456789";

       System.out.println(s2.substring(3,6));

       String x = "qwert";
       System.out.println(x.toString());
       System.out.println();
       System.out.println();
    }
    public static void main(String[] args) {


       SUbstring();


        String word = "Jabulabani ";

        word.concat(" Mabuza");// creates new string does
        // not add to the current one

    word += " Mvelase";

        char charss = word.charAt(2);


        System.out.println(word.concat(" --"));// this line of code will
        // modify the string
        System.out.println("index @ 6 :"+word.charAt( 6));
        System.out.println("length : "+ word.length());
        System.out.println("replace string "+ word.
                toUpperCase().replace("B","'BOSS'"));
        System.out.println("Sub string: " +word.substring(2));
        System.out.println("trimming : "+ word + "   p   " .trim());
        System.out.println();

        //testing attribute length and method length()
        String somthing = "worse";
        int[] arr = {1,2,3,4,5,};

        System.out.println(arr.length);


        System.out.println(somthing.length());


    }

}
