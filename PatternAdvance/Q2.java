package PatternAdvance;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int n=sc.nextInt();

    for(int i=1; i<=n; i++)
    {
        System.out.println();

        for(int j=1; j<=i; j++)
        {
            if(i==3 && j==2)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
    }

    }

}


