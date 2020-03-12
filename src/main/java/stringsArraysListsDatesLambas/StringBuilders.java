package stringsArraysListsDatesLambas;

// import java.security.spec.RSAOtherPrimeInfo;

public class StringBuilders {
    static  void StrBuilder(){
        StringBuilder stringBuilder = new StringBuilder("Phumlani");
        stringBuilder.append("PHUMLANI");
//        stringBuilder.reverse();
        stringBuilder.insert(0," --- ");
        stringBuilder.append(" "+2545);

        StringBuilder st = new StringBuilder();
//        st.append("MTHEMBU");

//        st.delete(2,5);
        st.append("JACKMABASOMZX");
        System.out.println("s "+st.substring(4,12));

        StringBuilder sb = new StringBuilder();
        sb.append(1234);


        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(st);
        System.out.println(st.length());
        System.out.println("len "+ sb.length());

    }

    public static void main(String[] args) {
        StrBuilder();

    }
}
