import java.io.*;
import java.util.*;

public class PE12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int i=1;
            while(div((i*(i+1))>>1)<=n)i++;
                
            System.out.println((i*(i+1))>>1);
        }
    }
    
    public static int div(int n){
        int ans=1;
        
        int p=1;
        while(n%2==0){
            n/=2;
            p++;
        }
        ans*=p;
        
        for(int i=3;i<=Math.sqrt(n);i+=2){
            p=1;
            while(n%i==0){
                n/=i;
                p++;
            }
            ans*=p;
        }
        if(n>2) ans*=2;
        return ans;
    }
}