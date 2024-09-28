package LoopAdvance;
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is not going to be stopped until you give a Negative No.");

        for(;;)
        {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            if(n<=0)
            {
                System.out.println("Found Negative no : "+n);
                System.out.println("breaking......");
                break;
            }
            int prime = 1;
            for(int i=2; i<n; i++)
            {
                if(n%i==0)
                {
                    prime = 0;
                    break;
                }
            }
            int a=1,b=0,c=0;
            int fibb=0;
            for(;c<=n;)
            {

                c=a+b;
                b=a;
                a=c;

                if(c==n)
                {
                    fibb=1;
                }
            }
            if(prime==1&&fibb==1)
            {
                System.out.println(n+" : is Prime and Fibonacci");
            } else if (fibb==1&&prime==0)
            {
                System.out.println(n+" : is Fibonacci but not Prime");
            } else if (prime==1&&fibb==0)
            {
                System.out.println(n+" : is Prime but not Fibonacci");
            }
        }
    }

}
