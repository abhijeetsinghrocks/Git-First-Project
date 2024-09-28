package LoopAdvance;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Staring Point : ");
        int n = sc.nextInt();
        System.out.print("Enter Ending Point : ");
        int m = sc.nextInt();

        for(;n<=m;n++)
        {
            int op=n;
            int palindrome=n;
            int rev=0;
            int count = 0;
            for(;op!=0;)
            {
                count++;
                int rem=op%10;
                rev=rev*10+rem;
                op=op/10;
            }
            if(count==0||count==1)
            {
                n++;
                continue;
            }
            if(rev==palindrome)
            {
                System.out.println(rev);
            }

        }

    }
}
