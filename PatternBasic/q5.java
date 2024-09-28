package PatternBasic;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int n = sc.nextInt();

        for(int hor=1; hor<=n; hor++)
        {
            System.out.print("\n");
            for(int ver=1; ver<=n; ver++)
            {
                if(hor%2==1 && ver%2==1)
                {
                    System.out.print("*");
                }
                else if(hor%2==0 && ver%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }
            }
        }
    }
}
