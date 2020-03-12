package sidepractice.kaplanReview;

public class StringsObjects {
    public static void main(String[] args) {

        String st = new String("one two");

        char [] ch = {'p','h','u','m','l','a','n','i'};

        ch[4] = 'j';
        System.out.println(ch);


        String chst = new String(ch);
        System.out.println(chst.length());


        System.out.println(st.length());
    }
}
