package ch04;

public class Array10 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka-angka genap dengan angka setelahnya genap");
        int selisih;
        for(int a = 0; a < 13; a++){
            if(nilai[a]%2==0){
                for(int b = a+1; b<13; b++){
                    if (nilai[b]%2==0){
                        selisih = nilai[a]-nilai[b];
                        selisih = Math.decrementExact(selisih);
                        System.out.println("Selisih dari "+ nilai[a] + "-" + nilai[b] + " = " + selisih);
                        break;
                    }
                }
            }
        }
    }
}
