package ch06;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int a = 0; a < nilai.length-1; a++){
            int maksimal = a;
            for(int b = a; b < nilai.length; b++){
                boolean urutan = nilai[b] < nilai[maksimal];
                if(urutan){
                    maksimal = b;
                }
            }
            int tmp = nilai[a];
            nilai[a] = nilai[maksimal];
            nilai[maksimal] = tmp;
        }
        cetak(nilai);
    }
    public static void cetak(int[] nilai){
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+ " ");
        }
    }
}
