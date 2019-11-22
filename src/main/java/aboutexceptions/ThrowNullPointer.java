package aboutexceptions;

import java.util.ArrayList;

class ThrowNullPointer{

  ArrayList<String> list = new ArrayList<> ();
int one = 23456;

    public static void main(String[] args) {
  // ArrayList<String> list ;
        // if(list != null)
        
        System.out.println(new ThrowNullPointer().list.add("two"));
        ThrowNullPointer trn = new ThrowNullPointer();
        trn.list.add("one");

        // list.add("one");



    // list.add("one");



    System.out.println(trn.list);
    System.out.println(trn.one);
    }
}