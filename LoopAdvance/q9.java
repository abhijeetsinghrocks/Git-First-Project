package LoopAdvance;
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Point : ");
        int n = sc.nextInt();

        System.out.print("Enter Ending Point : ");
        int m = sc.nextInt();

        for(;n<=m;n++)
        {
            int op=n;
            int comp=n;
            int result=0;

            for(;op!=0;)
            {
                int fact=1;
                int rem = op%10;
                op=op/10;
                for(int i=1; i<=rem; i++)
                {
                    fact=fact*i;
                }
                result=result+fact;
            }
            if(result==comp)
            {
                System.out.println(result+" : is Strong");
            }
        }


    }
}
