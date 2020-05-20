package ch07;

public class AlgoritmaBlockSort {
    public static void main(String[]args){
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int tmp = 0;

        for(int a = 0; a < nilai.length; a++){
            for(int b = 0; b < nilai.length; b++){
                if (nilai[a]<nilai[b]){
                    tmp = nilai[a];
                    nilai[a] = nilai[b];
                    nilai[b] = tmp;
                }
            }
        }
        for(int a = 0; a < 13; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}
