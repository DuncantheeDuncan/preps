package assignments;

public class PrimitiveCasting {

    public static void main(String[] args) {

//        PrimitiveCasting p = new PrimitiveCasting();

        int bb = 7689;
        System.out.println(bb + " int");
        byte b =0;
        System.out.println(b + " byte");
        b  = (byte) bb;

        System.out.println();
        System.out.println(b + " byte");
        System.out.println(bb + " int");
        System.out.println("\n*********************************");

        float fl = 45654321354343343434343443434343435897.09f;

        short sh = 1;

        sh +=fl;

        System.out.println(sh);

        short sho;
//        sho = (short) fl;
        fl = (float) sh;
        System.out.println(fl+" short");
    }

    public int integer(){return 6;}


}
