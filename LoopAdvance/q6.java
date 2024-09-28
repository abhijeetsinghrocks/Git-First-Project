package LoopAdvance;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Point : ");
        int n = sc.nextInt();

        System.out.println("Enter Ending Point : ");
        int m = sc.nextInt();
        int a=1,b=0,c=0;
        for(;c<=m;)
        {
            c=a+b;
            b=a;
            a=c;

            if(c>=n && c<=m)
            {
                System.out.println(c);
            }
        }

    }
}
