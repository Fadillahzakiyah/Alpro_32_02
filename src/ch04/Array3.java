package ch04;

public class Array3 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka ganjil");
        for(int a = 0; a < 13; a++){
            if(nilai[a]%2!=0){
                System.out.print(nilai[a]+ " ");
            }
        }
    }
}
