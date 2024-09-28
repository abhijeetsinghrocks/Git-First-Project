package LoopAdvance;
import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int count=0;
        int first=0,last=0;
        for(;n!=0;)
        {
            int dig = n%10;
            n=n/10;
            if(count==0)
            {
                last=dig;
            }
            if(n==0)
            {
                first=dig;
            }
            count++;
        }
        System.out.println("First Digit : "+first);
        System.out.println("Last Digit  : "+last);

    }
}
