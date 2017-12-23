import java.io.*;
import java.util.*;

public class PE17 {
    
    static String units[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static String teens[] = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String tens[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    
    static String other[] = {"","","Thousand","Million","Billion","Trillion"};
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            if(n==0) {System.out.println(0); continue;}

            int num[] = new int[15];
            
            for(int i=14;i>=0;i--){
                num[i] =(int) (n%10);
                n/=10;
            }
           
            for(int i=0;i<15;i+=3){
                print(num,i);
            }
            System.out.println();
        }
    }
    
    public static void print(int num[], int i){
        if(num[i]==0 && num[i+1]==0 && num[i+2]==0) return;
        if(num[i]!=0){
            System.out.print(units[num[i]]+" Hundred ");
        }
        if(num[i+1]==1){
            System.out.print(teens[num[i+2]]+" ");
            System.out.print(other[5-(i/3)]+" ");
            return;
        }
        if(num[i+1]!=0)
            System.out.print(tens[num[i+1]]+" ");
        if(num[i+2]!=0)
            System.out.print(units[num[i+2]]+" ");
        
        System.out.print(other[5-(i/3)]+" ");
    }
    
}