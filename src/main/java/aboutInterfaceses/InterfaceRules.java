package aboutInterfaceses;
interface  InterRules{
    public  void method1();
    public abstract  void method2();


//    int one; // instance
    int onee = 88; // constant
final int jax = 8;
public static final int kil = 9;




}
public class InterfaceRules implements InterRules {

    void i(){
        ;;;;;;;;;;;;;;
        ;;;;;;;;;
        ;;;;;;
        ;;;
        ;;
    }

//default void one(){}
    @Override
    public void method1() {

    }
    @Override
    public void method2() {
    }
    public static void main(String[] args) {
        InterRules f = new InterfaceRules();
        f.method1();
        System.out.println(onee);

        int r = 34 + onee;
        System.out.println(r);

        InterfaceRules o = new InterfaceRules();
        o.i();
    }
}
