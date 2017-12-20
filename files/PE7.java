import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p[] = primes();

        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(p[n]);
        }
    }
    
    
    public static int[] primes(){
        int isPrime[] = new int[1000001];
        Arrays.fill(isPrime,1);
        for(int i=2;i<1000001;i++)
            if(isPrime[i]==1)
                for(int j=2;j*i<1000001;j++)
                    isPrime[i*j]=0;
        
        int primes[] = new int[10001];
        for(int i=2,k=1;i<1000001 && k<10001 ;i++)
            if(isPrime[i]==1){primes[k]=i;k++;}
        return primes;
    }
}