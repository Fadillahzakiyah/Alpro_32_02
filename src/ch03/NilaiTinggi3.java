package ch03;

import java.util.Scanner;

public class NilaiTinggi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai x");
        int x = input.nextInt();
        System.out.println("Masukan nilai y");
        int y = input.nextInt();
        System.out.println("Masukan nilai z");
        int z = input.nextInt();

        if(x>y && x>z){
            System.out.println("Nilai tertinggi adalah x yaitu "+x);
        }
        else if(y>z && y>x){
            System.out.println("Nilai tertinggi adalah y yaitu "+y);
        }
        else if(z>y && z>x){
            System.out.println("Nilai tertinggi adalah z yaitu "+z);
        }
        else {
            System.out.println("Nilai x, y, dan z ada yang sama tinggi");
        }
    }
}
