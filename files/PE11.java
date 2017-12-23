import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[20][20];
        
        for(int i=0; i < 20; i++)
            for(int j=0; j < 20; j++)
                a[i][j] = in.nextInt();
               
        int max=0;
        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++){
                if(j<17)
                    max = Math.max(max,a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3]);
                if(i<17)
                    max = Math.max(max,a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j]);
                if(j>=3 && i<17)
                    max = Math.max(max,a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3]);
                if(j<17 && i<17)
                    max = Math.max(max,a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3]);
            }
        
        System.out.println(max);        
    }
}