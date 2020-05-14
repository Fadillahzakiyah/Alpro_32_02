package ch04;

public class Array4 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka kelipatan3");
        for(int a = 0; a < 13; a++){
            if(nilai[a]%3==0)
                System.out.print(nilai[a]+ " ");
        }
    }
}
