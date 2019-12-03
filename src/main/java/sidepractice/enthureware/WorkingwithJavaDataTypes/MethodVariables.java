package sidepractice.enthureware.WorkingwithJavaDataTypes;
interface  R{
    void on();
}
public class MethodVariables {
    int b = 28;
    void B(int a){

        System.out.println(++b);
//        b = a;
    }


    public static void main(String[] args) {
        MethodVariables m = new MethodVariables();
        m.b = 2;
        int d = m.b;
        m.B(m.b);

        System.out.println(d);

        String s = "ABCD".substring(1,3);
        System.out.println(s);

        R r = new R(){
            @Override
            public void on() {

            }
        };

    }
}
