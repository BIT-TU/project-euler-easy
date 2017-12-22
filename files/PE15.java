import java.io.*;
import java.util.*;

public class PE15 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mod = 1000000007;
        int pascal[][] = modPascal(1000,mod);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            
            System.out.println(pascal[m+n][n]);
        }
        
    }
    
    public static int[][] modPascal(int maxn, int m){
        int p[][] = new int[maxn+1][maxn+1];
        
        for(int i=1;i<=maxn;i++){
            p[i][0]=1;
            for(int j=1;j<i;j++)
                p[i][j]=(p[i-1][j]+p[i-1][j-1])%m;
            p[i][i]=1;
        }
        
        return pasc;
    }
}