import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class PE13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger b = new BigInteger("0");
        while(n-->0)
            b = b.add(new BigInteger(in.next()));

        System.out.println(b.toString().substring(0,10));
    }
}