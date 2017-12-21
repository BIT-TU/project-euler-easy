import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String str = in.next();
            String nums[] = str.split("0+");

            long max=0;
            for(int w=0;w<nums.length;w++){
                if(k>nums[w].length()) continue;
                
                long p=1;
                for(int i=0;i<k;i++)                    
                    p*= (nums[w].charAt(i)-'0');
                
                max = Math.max(max,p);
                for(int i=k;i<nums[w].length();i++){
                    p /= (nums[w].charAt(i-k) - '0');
                    p *= nums[w].charAt(i)-'0';
                    if(max<p)
                        max = p;
                }
            }
            System.out.println(max);
        }
    }
}
