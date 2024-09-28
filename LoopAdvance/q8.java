package LoopAdvance;
import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Point : ");
        int n = sc.nextInt();

        System.out.print("Enter Ending Point : ");
        int m = sc.nextInt();

        for(;n<=m;n++)
        {
            int check = n;
            int op = n;
            int count = 0;
            int arm=n;

            int result=0;
            for(;op!=0;)
            {
                int rem = op%10;
                op = op/10;
                count++;
            }
            for(;arm!=0;)
            {
                int base=1;
                int rem = arm%10;
                arm=arm/10;
                for (int i = 1; i <= count; i++)
                {
                    base = base * rem;
                }
                result=result+base;
            }
            if(result==check)
            {
                System.out.println(result+" : is Armstrong");
            }

        }
    }
}
