package stringsArraysListsDatesLambas;

import java.util.ArrayList;

public class ConstructingArrays {
static void oneDimention(){
    System.out.println("* * * * * * * * * * * * * * * * * *");
    int[] oneD = new int[]{2,4,6,32,78,5,9,07,7};

    int add = oneD[0]= 1000;
    add-=500;
    System.out.println(oneD[0]);
    System.out.println(add);
    System.out.println(oneD.length);
    System.out.println("* * * * * * * * * * * * * * * * * *");

}
static void Two2D(){
int llo = 30;
    int multi [][] = new int [3][];// declaring and instantiating.

    multi[0] =  new int[10];// giving the first Dimension a fixed size
    multi[0][0] =1998;
    multi[0][1] =llo+=llo;
    multi[0][2] =16;


    multi[1] = new int[5];
    multi[2] = new int[2];
    System.out.println("length "+multi[0].length);
//    multi[3] = new int[5]; arrayIndexOutOfBound runtime

for (int i = 0; i < multi[0].length; i++){

    if (multi[0][i] == 0)break;
    System.out.println(multi[0][i] +" " /*+ multi[1][i]*/);
}

int anony [][] = new int[][]{{3,4,5,6,3,6,45,},{5,4},{4,89,25},{4,8,2}};
    System.out.println("anony "+ anony.length);
    System.out.println(anony[3][0]);
    }
    public static void main(String[] args) {

    Two2D();

    oneDimention();


        ArrayList <String> list;
//        if(list !=null)
//       list.add("phumlani");
String arrrr[][] ={{"one","two"},null,{"three"}, new String[10]};

        System.out.println(arrrr[3][0].length());

//        System.out.println(arrrr[1]);






// allowed declarations
//    String[][] s;
//    String m [][];
//    String[] k[];
//    int[] in;
//    int [][]z;
//    String [][] mlti =  new String[2][];


    }
}
