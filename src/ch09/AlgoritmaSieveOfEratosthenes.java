package ch09;

public class AlgoritmaSieveOfEratosthenes {
    public static void soe (int lim){
        boolean prima[] = new boolean[lim+1];
        for(int a = 0; a < lim; a++)
            prima[a] =  true;
        for(int b = 2; b*b <= lim; b++){
            if(prima[b]==true){
                for(int a = b*b; a <= lim; a+=b)
                    prima[a]=false;
            }
        }
        for(int a =2; a <= lim; a++){
            if(prima[a]==true)
                System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int lim = 1000;
        AlgoritmaSieveOfEratosthenes sieve = new AlgoritmaSieveOfEratosthenes();
        sieve.soe(lim);
    }
}
