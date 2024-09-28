package LoopAdvance;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Point : ");
        int n = sc.nextInt();
        System.out.print("Enter Ending Point : ");
        int m = sc.nextInt();

        for(;n<=m;n++)
        {
            int prime=0;
            for(int i=2; i<n; i++)
            {
                if(n%i==0)
                {
                    prime=1;
                    break;
                }
            }
            if(prime==0)
            {
                System.out.println(n+" : is Prime no");
            }
        }
    }
}
