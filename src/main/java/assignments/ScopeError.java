package assignments;

public class ScopeError {
void go(){
   ph: for (int i =0; i < 5; i++){
        boolean test = false;

        if (i == 3){

            test = true;
            continue ph;
//            break ;
        }
        System.out.println(test);
    }
    System.out.println("out");
}

// how many time test is going to print?
//    how may time false is going to be printed? and true ?
//
    public static void main(String[] args) {

    ScopeError se = new ScopeError();
    se.go();

    }
}
