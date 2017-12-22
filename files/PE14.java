import java.io.*;
import java.util.*;

public class PE14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lim = 5*(int)(1e6) + 1;
        long len[] = new long[lim];
        Arrays.fill(len,-1);
        
        for(int i=2;i<lim;i++)
                len[i] = coll(i,len);

        long max=0,maxi=0;
        long ans[] = new long[lim];
        for(int i=2;i<lim;i++){
            if(max<=len[i]){
                max=len[i];
                maxi=i;
            }
            ans[i]=maxi;
        }

        int t = in.nextInt();
        while(t-->0){
            System.out.println(ans[in.nextInt()]);
        }
    }
    
    
    public static long coll(long n, long mem[]){
        if(n==1) return 1;
        if(n<mem.length && mem[(int)n]!=-1) return mem[(int)n];
        long ans = 0;
        if(n%2==0)
            ans = 1+coll(n/2,mem);   
        else 
            ans = 1+coll(3*n+1,mem);
        if(n<mem.length) mem[(int)n] = ans;
        return ans;
        
    }
    
}