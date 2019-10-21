package objectOrientation;

class MyColor {

    public void color1() {

        System.out.print("Color is Green ");
    }
}

class HisColor extends MyColor {

    public void color2() {
        System.out.print("color is Blue ");


    }
}

class TheirColor extends HisColor {

    public void color3() {
        System.out.print("color is Black ");
    }
}

public class PolymorphicMethod {
    public static void main(String[] args) {

        MyColor myColor = new MyColor();

        HisColor hisColor = new HisColor();

        hisColor.color1();
        myColor.color1();

        System.out.println(hisColor instanceof TheirColor);

        System.out.print("succes or not ? ");
        ((TheirColor)hisColor).color3();





    }
}