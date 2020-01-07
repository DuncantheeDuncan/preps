package aboutAbstracts;

public abstract class AbstractClass {

    AbstractClass(){}
    String me = "d";
    private String mee = "d";
    public String meee = "d";

    void one(){
        System.out.println("one");
    }
    public  int onee(){
        System.out.println("onee");
        return 5*5;
    }
    abstract  void oneee();

    public static void main(String[] args) {
//        System.out.println(AbstractClas.onee());

    }
}
