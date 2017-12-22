import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PE16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String str = BigInteger.valueOf(2).pow(n).toString();
            System.out.println(sum(str));
        }
    }
    
    public static int sum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++)
            sum+=str.charAt(i)-'0';
        return sum;
    }
}