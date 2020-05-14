package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmaLCS {
    public String lcs(String huruf1, String huruf2) {
        int array1 = huruf1.length();
        int array2 = huruf2.length();
        int[][] array = new int[array1 + 1][array2 + 1];

        for (int a = array1 - 1; a >= 0; a--) {
            for (int b = array2 - 1; b >= 0; b--) {
                if (huruf1.charAt(a) == huruf2.charAt(b))
                    array[a][b] = array[a + 1][b + 1] + 1;
                else
                    array[a][b] = Math.max(array[a + 1][b], array[a][b + 1]);
            }
        }
        int a = 0;
        int b = 0;
        StringBuilder input = new StringBuilder();
        while (a < array1 && b < array2) {
            if (huruf1.charAt(a) == huruf2.charAt(b)) {
                input.append(huruf1.charAt(a));
                a++;
                b++;
            } else if (array[a + 1][b] >= array[a][b + 1])
                a++;
            else
                b++;
        }
        return input.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan String1 =");
        String huruf1 = input.readLine();
        System.out.println("Masukan String2 =");
        String huruf2 = input.readLine();

        AlgoritmaLCS objek = new AlgoritmaLCS();
        String hasil = objek.lcs(huruf1, huruf2);
        System.out.println("Longest Common Subsequence : "+ hasil);

    }
}
