package PatternBasic;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        int space=n-1;

        for(int hor=1; hor<=n; hor++)
        {
            System.out.print("\n");
            while(space>=1)
            {
                System.out.print("-");
                space--;
            }
            for(int ver=1; ver<=hor; ver++)
            {
                System.out.print("*");
            }
        }
    }
}
