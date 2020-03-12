package sidepractice.crowedquest.aboutStatics;
class Overridee{
    static void show(){
        System.out.print("Phumlani ");
    }
}
class Redefine extends  Overridee{

    static void show(){
        System.out.print("Mthembu ");
    }
}

public class StatikCantBeOverride {

    public static void main(String[] args) {

    Overridee[] o = {new Redefine(),new Overridee(), new Redefine(),new Redefine()};

    for (int i = 0; i <o.length; i++){
        o[i].show();

    }
    }


}
