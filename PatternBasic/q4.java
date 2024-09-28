package PatternBasic;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int n = sc.nextInt();

        for(int hor=n; hor>=1; hor--)
        {
            System.out.print("\n");
            for(int ver=1; ver<=hor; ver++)
            {
                System.out.print("* ");
            }
        }
    }
}
