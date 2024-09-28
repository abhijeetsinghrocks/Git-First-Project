package Loops;
import java.util.*;
public class q23Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Fibonacci Till Given no :");
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int a=1;
        int b=0;
        int c=0;

        while(c<=n)
        {
            if(c==1)
            {
                System.out.print("1, ");
            }
            System.out.print(c+", ");
            c=a+b;
            b=a;
            a=c;


        }

    }
}
