package sidepractice.enthureware.WorkingwithJavaDataTypes;

public class ChainedOperator {

    public static void main(String[] args) {


        int a = 8;
        int b = 7;
        int c = 56;
        int cd = 76;
        int sd;

        a = b = c =cd; // this is actualy valid in java

        System.out.println(a);

        int ma,ij,kk;

        ma = ij=kk = 9876;

        System.out.println(ma);
        String m,j,lk,oi,y;

        m = "m";
        j = "j";
        lk = "lk";
        oi ="oi";
        y = "y";

        m = j =lk =oi =y = "oo";
        System.out.println(m );

        float _g_z = 1__23_4.56f; // numeric values
        // can only have underscores in between two numbers

        int s = 's';
        int mv = s;
        System.out.println("this iss int char (--) "+ s + " "+ mv);
    }
}
