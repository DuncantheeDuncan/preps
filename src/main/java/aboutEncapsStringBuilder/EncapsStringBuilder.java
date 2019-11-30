package aboutEncapsStringBuilder;

/**
 * EncapsStringBuilder
 */
class ToAccess{
    private StringBuilder prstrng = new StringBuilder("Jack");

    StringBuilder gBuilder(){
        return prstrng;
    }

    void printPrstrn(){
        System.out.println(gBuilder());
    }
}
public class EncapsStringBuilder {   
  int i;
    public static void main(String[] args) {
        ToAccess sp = new ToAccess();

        // sp.prstrng.append("jack");// nullPointer is invoked
        System.out.println(sp.gBuilder().append(" Mthembu"));
        sp.gBuilder().append(" owavela enyandeni");

        System.out.println(sp.gBuilder());
        sp.printPrstrn();
        // EncapsStringBuilder.i;// cannot acces variable like this

        StringBuilder sp2 = sp.gBuilder();
        sp2.append(" Ngoza");

        // System.out.println(sp2);
        
        // double klm = 456;
        // float kl = 123f + klm;// compalition error since float is smaller than double
        // System.out.println(kl);


    }
}