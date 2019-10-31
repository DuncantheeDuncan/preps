package sidepractice.kaplanReview;
interface StringInterface {
    public String toString();
    public String toString(String d);

}

class SuperString2 implements StringInterface {
    public String toString() {
        return "Super String 1";
    }

    public String toString(String str) {
        return "Super String 2";
    }




}
public class SubString2 extends SuperString2 {

    public String toString() {
        return "Sub String 1";
    }

    public String toString(String str) {
        return "Sub String 2";
    }



    public static void main(String[] args) {
//TODO: to check later why an error!!

// StringInterface string = new SubString();
//
//        page 58
//        System.out.println(string.toString("test"));
    }
}

