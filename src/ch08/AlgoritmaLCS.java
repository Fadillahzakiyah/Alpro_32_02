package ch08;

public class AlgoritmaLCS {
    public static String lcs (String String1, String String2){
        int pertama = String1.length();
        int kedua = String2.length();
        int[][]length = new int[pertama+1][kedua+1];
        int maksimum = 0;
        int akhir = 0;

        for(int a = 0; a < pertama; a++){
            for(int b = 0; b < kedua; b++){
                if( a == 0 || b == 0){
                    length[a][b] = 0;
                }
                else if(String1.charAt(a-1)==String2.charAt(b-1)){
                    length[a][b] = length[a-1][b-1]+1;
                    maksimum = Math.max(maksimum, length[a][b]);
                    akhir = a;
                }
                else{
                    length[a][b] =0;
                }
            }
        }
        return String1.substring(akhir-maksimum+1, akhir+1);
    }
    public static void main(String[] args) {
        System.out.println(lcs("BABCA","ABABC"));
    }
}
