package ch06;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int a = 1; a < nilai.length; a++){
            for(int b = a; b >= 1; b--){
                boolean urutan = nilai[b]<nilai[b-1];
                if(!urutan){
                    break;
                }
                int tmp = nilai[b];
                nilai[b] = nilai[b-1];
                nilai[b-1] = tmp;
            }
        }
        cetak(nilai);
    }
    public static void cetak(int[] nilai){
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+ " ");
        }
    }
}
