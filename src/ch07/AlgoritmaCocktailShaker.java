package ch07;

public class AlgoritmaCocktailShaker {
    public static void cocktailsort(int[]nilai){
        boolean pertukaran;
        do{
            pertukaran = false;
            for(int a = 0; a <= nilai.length-2; a++){
                if(nilai[a]>nilai[a+1]){
                    int tmp = nilai[a];
                    nilai[a] = nilai[a+1];
                    nilai[a+1] = tmp;
                    pertukaran = true;
                }
            }
            if(!pertukaran){
                break;
            }
        }while(pertukaran);
    }
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        cocktailsort(nilai);
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}
