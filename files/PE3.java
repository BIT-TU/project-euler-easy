import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(maxPrime(n));
        }
    }
    
    public static long maxPrime(long n){
        long lim = (long)Math.sqrt(n);
        
        while(n%2==0) n/=2;
        if(n==1) return 2;
        
        for(int i=3;i<=lim;i+=2){
            while(n%i==0) n/=i;
            if(n==1) return i;
        }
        
        return n;
    }
}
