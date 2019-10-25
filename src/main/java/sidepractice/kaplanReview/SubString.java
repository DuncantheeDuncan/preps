package sidepractice.kaplanReview;
class SuperString{

    public String toString(){

        return "Super String 1";
    }

    public Object toString(String str){

        return "Super string 2";
    }
}


public class SubString extends SuperString  {
@Override
    public String toString(){

        return "Sub String 1";
    }

@Override
    public Object toString(String str){

        return "Sub string 2";
//    return 9;
    }


    public static void main(String[] args) {


        SuperString string = new SubString();

        System.out.println(string);

//        SubString string = new SubString();
//        System.out.println(string);

    }
}
