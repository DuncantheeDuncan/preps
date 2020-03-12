package sidepractice.kaplanReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(1);
        names.add("Amy");
        names.add("Anne");
        names.add("Jason");
        names.add("Mpho");
        names.add("Steven");
        System.out.println(names.get(2));
        System.out.println(names.size());
        System.out.println(names);

        System.out.println(names.contains("mpho"));



//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amy","Anne","Brian","George","Ruth","Todd"));
//        names.add("phumlani");
    }
}
