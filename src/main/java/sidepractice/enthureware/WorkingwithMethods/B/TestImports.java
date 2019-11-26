package sidepractice.enthureware.WorkingwithMethods.B;

import sidepractice.enthureware.WorkingwithMethods.A.*;

import sidepractice.enthureware.WorkingwithMethods.A.ImportTester;

import static sidepractice.enthureware.WorkingwithMethods.A.ImportTester.*; // static imports
//import static sidepractice.enthureware.WorkingwithMethods.A.ImportTester.onetwo; // explicitly imports.

public class TestImports {


    public static void main(String[] args) {


//        ImportTester i =new ImportTester(); // only static fields imported

        System.out.println("* * **** * * * * * * * * * * * *");
        System.out.println("STATIC FIELDS"); // static imports
        one();
        System.out.println(onetwo);
        System.out.println("\n* * **** * * * * * * * * * * * *");

        System.out.println("NON-STATIC");
        ImportTester imp = new ImportTester();
        System.out.println("\n* * **** * * * * * * * * * * * *");
// accessing  fields in a non-static way..
        System.out.println(ImportTester.onetwo);
        ImportTester.one();









    }
}
