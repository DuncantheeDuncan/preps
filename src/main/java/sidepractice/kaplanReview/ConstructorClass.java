package sidepractice.kaplanReview;

class Reindeer extends  ConstructorClass{
    public Reindeer(int age){
        System.out.print("Reindeer");
    }
    public boolean hasHorns(){
        return true;
    }
}

public class ConstructorClass {
    public ConstructorClass(){
        System.out.print("Deer");
    }

    public ConstructorClass(int age){
        System.out.print("DeerAge");
    }
    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        ConstructorClass constructorClass = new Reindeer(5);
//        System.out.println("," + constructorClass.hasHorns());
    }
}
