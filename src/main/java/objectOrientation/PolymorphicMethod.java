package objectOrientation;

//class ovelod{
//    public void in(){
//        System.out.println("overloaded..");
//    }
//
//    public void in(int i){
//        System.out.println("success");
//    }
//}

class HisColor extends MyColor {

    public void color() {
//        System.out.println("color is Blue");
        MyColor m = new MyColor();
        m.color();

    }
}

class TheirColor extends HisColor {

    public void color() {
        HisColor N = new HisColor();
        N.color();
    }
}

public class PolymorphicMethod {
    public static void main(String[] args) {

        MyColor color = new TheirColor();

        color.color();
//ovelod lod = new ovelod();
//lod.in(5);


    }


}
