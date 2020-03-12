package sidepractice.mediumRead;
class on{
    int tryingToFetItFromSubclass = 100000000;
    static  void ii(){
        System.out.println("static");
    }


}

class SomePointers extends on{
    
static void ii(){
    System.out.println("statik");

}
    public static void main(String[] args) {

    on en = new SomePointers();
//    en.tryingToFetItFromSubclass -= 50000;
//
//        System.out.println(en.tryingToFetItFromSubclass);




    ii();

    }
}
