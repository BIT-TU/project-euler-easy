import java.io.*;
import java.util.*;

public class Solution {
    static int SUNDAY=1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
      
        while(t-->0){
            long y1 = in.nextLong();
            long m1 = in.nextLong();
            long d1 = in.nextInt();
            if(d1>1){
                 y1+= m1/12;
                m1 = (m1%12)+1;
            } 
            
            long y2 = in.nextLong();
            long m2 = in.nextLong();
            long d2 = in.nextInt();
            long c=0;
            
            while(y1<=y2){
               
                if(y1==y2 && m1>m2) break;
                
                if(zeller(y1,m1,1)==SUNDAY){
                        c++;
                }

                y1+= m1/12;
                m1 = (m1%12)+1;      
            }
           
            System.out.println(c);
        }
    }
    
    
    public static long zeller(long y, long m, long q){
        if(m==1 || m==2){
            y--;
            m+=12;
        }
        
        long k =  (y%100);
        long j =  (y/100);
        
        long h = (q + ((13*(m+1))/5) + k + (k/4) + j/4 + 5*j)%7;
        
        return h;
    }
}