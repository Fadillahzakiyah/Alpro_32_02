package ch04;

public class Array11 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka-angka setelahnya bernilai lebih besar");
        for(int a = 0; a < 13; a++){
            if(a < nilai.length-1){
                if(nilai[a]<nilai[a+1]){
                    System.out.print(nilai[a] + " ");
                }
            }
        }
    }
}
