package LoopAdvance;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int min=9999,max=-9999;
        for(;n!=0;)
        {
            int dig=n%10;
            n=n/10;
            if(dig>max)
            {
                max=dig;
            }
            if(dig<min)
            {
                min=dig;
            }

        }
        System.out.print("Min digit is : "+min);
        System.out.print("\nMax digit is : "+max);
    }
}
