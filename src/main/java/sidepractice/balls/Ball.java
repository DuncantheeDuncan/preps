package sidepractice.balls;

interface  Bouncable{
    void bounce();
    int getBounceFactor();
     String getBallName(String name);

}



class GameWithBouncyBall{



     static  void play(Bouncable bouncable){

        if (bouncable.getBounceFactor() > 3) {

            System.out.println("Let's play the game ");
            bouncable.bounce();
        }else {

            System.out.println("This is not bouncable enough  to play this game!");
        }
    }

}

class BeachBall implements  Bouncable{


    public  String getBallName(String name){

        return name;
    }


    public void bounce() {
        System.out.println("Bounce Beach  ball");
    }

    public int getBounceFactor() {
        return 5;
    }


}

class CricketsBall implements Bouncable{

    public void bounce() {
        System.out.println("cricket ball bouncing!!");
    }

    public int getBounceFactor() {
        return 0;
    }

    public String getBallName(String name) {


        return name;
    }


}
public class Ball /*implements Bouncable*/{

    public static void main(String[] args) {


        GameWithBouncyBall.play(new BeachBall());
        GameWithBouncyBall.play(new CricketsBall());
    }



}

