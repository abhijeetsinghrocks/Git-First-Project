package LoopAdvance;

import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Starting Point : ");
        int n = sc.nextInt();

        System.out.println("Enter Ending Point : ");
        int m = sc.nextInt();

        for(;n<=m;n++)
        {
            if(n%2==0)
            {
                System.out.print("\n"+n+" Coding ");
            }
            else
            {
                System.out.print(n+" Age");
            }
        }
    }
}
