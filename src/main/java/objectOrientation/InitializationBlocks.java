package objectOrientation;

public class InitializationBlocks {

    InitializationBlocks(int x){ System.out.println("1st argument"); }

    InitializationBlocks(){ System.out.println("no-arg const"); }


    static { System.out.println("1st static init"); }


    { System.out.println("1st instance init"); }



    { System.out.println("2nd instance init"); }


    public void checkingForwardReference(){
        int o = 7; i +=o;
        System.out.println(i);
        }

    static { System.out.println("2nd static init"); }

    int i = 7;
    public static void main(String[] args) {

        new InitializationBlocks();
        new InitializationBlocks(5);
        new InitializationBlocks().checkingForwardReference();

    }
}
