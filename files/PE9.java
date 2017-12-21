import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            long maxP = -1;
            for(int a=1;a<n;a++){
                int b = ((n*n) - (2*n*a)) /(2*(n-a));
                int c = n-a-b;
              
                if(c*c == a*a + b*b && a<b && b<c)
                    maxP = Math.max(maxP,a*b*c);
            }

            System.out.println(maxP);
        }
    }
}