package ch03;

import java.util.Scanner;

public class PembagiTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan =");
        int bilangan = input.nextInt();
        for(int a = 3; a <= bilangan; a++){
            if(bilangan%a!=0){
                a = a+1;
                if(bilangan%2 == 0){
                    int pembagi = a;
                    System.out.print(pembagi+ " ");
                    break;
                }
                else {
                    int pembagi = a;
                    System.out.println(pembagi+ " ");
                    break;
                }
            }
        }
        System.out.println(" adalah pembagi terkecil dari bilangan "+bilangan);
    }
}
