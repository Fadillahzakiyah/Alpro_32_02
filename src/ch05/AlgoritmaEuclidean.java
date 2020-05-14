package ch05;

import java.util.Scanner;

public class AlgoritmaEuclidean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai pertama =");
        int nilai1 = input.nextInt();
        System.out.println("Masukan nilai kedua =");
        int nilai2 = input.nextInt();
        int pertama = nilai1;
        int kedua = nilai2;

        if(nilai2==0){
            System.out.println("FPB dari "+"("+pertama+","+kedua+")"+" = "+ nilai1);
        }
        else {
            do{
                int sisabagi = nilai1%nilai2;
                nilai1 = nilai2;
                nilai2 = sisabagi;
            }while (nilai2!=0);
            System.out.println("FPB dari "+"("+pertama+","+kedua+")"+" = "+ nilai1);
        }
    }
}
