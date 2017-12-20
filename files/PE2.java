import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            long sum=0,p1=0,p2=2;
            while(p2<n){
                sum+=p2;
                long tmp =p2*4 + p1;
                p1 = p2;
                p2 = tmp;
            }
            
            System.out.println(sum);
        }
    }
}