import java.io.*;
import java.util.*;

public class PE18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int dp[] = new int[n];
            
            for(int i=0;i<n;i++){
                int row[] = new int[n];
                int newDp[] = new int[n];

                for(int j=0;j<=i;j++)
                    row[j] = in.nextInt();
                
                for(int j=0;j<n;j++)
                    newDp[j] = row[j] + ((j-1>=0)? Math.max(dp[j-1],dp[j]) : dp[j]);
                
                dp = newDp;
            }

            int max=0;
            for(int i=0;i<n;i++)
                max = Math.max(max,dp[i]);
            System.out.println(max);
        }   
    }
}