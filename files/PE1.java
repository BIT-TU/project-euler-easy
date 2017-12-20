import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long m3 = n%3==0 ?  n/3-1 : n/3;
            long m5 = n%5==0 ?  n/5-1 : n/5;
            long m15 = n%15==0 ?  n/15-1 : n/15;
            System.out.println(3*((m3*(m3+1))/2) + 5*((m5*(m5+1))/2) - 15*((m15*(m15+1))/2) );
        }
    }
}