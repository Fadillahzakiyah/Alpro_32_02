package ch07;

public class AlgoritmaMergeSort {
    public static void mergesort(int nilai[], int b, int c){
        int nilaiterendah= b;
        int nilaitertinggi= c;
        if(b >= c){
            return;
        }
        int nilaitengah = (nilaiterendah+nilaitertinggi)/2;
        mergesort(nilai, nilaiterendah, nilaitengah);
        mergesort(nilai, nilaitengah+1, nilaitertinggi);
        int akhir = nilaitengah;
        int awal = nilaitengah+1;
        while((b <= akhir)&&(awal<=nilaitertinggi)){
            if(nilai[nilaiterendah]<nilai[awal]){
                nilaiterendah++;
            }
            else{
                int tmp = nilai[awal];
                for(int d = awal-1; d >= nilaiterendah; d--){
                    nilai[d+1]=nilai[d];
                }
                nilai[nilaiterendah]=tmp;
                nilaiterendah++;
                akhir++;
                awal++;
            }
        }
    }
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        mergesort(nilai, 0, nilai.length-1);
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}
