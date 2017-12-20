import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long sum = ((long)n*(n+1))/2;
            long sqr = ((long)n*(n+1)*(2*n+1))/6;
            
            System.out.println((sum*sum)-sqr);
        }
    }
}