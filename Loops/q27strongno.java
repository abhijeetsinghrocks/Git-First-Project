package Loops;
import java.util.*;
public class q27strongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program For Finding a Given no is Strong no or not");
        System.out.println("\nEnter a Number : ");
        int n = sc.nextInt();

        int temp = n;
        int result=0;

        for(;n!=0;)
        {
            int fact=1;
            int rem = n%10;
            n=n/10;
            for(int i=1; i<=rem; i++)
            {
                fact=fact*i;
            }
            result=result+fact;
        }
        if (result == temp)
        {
            System.out.println(result+" : is Strong no");
        }
        else
        {
            System.out.println(temp+" : is not Strong no");
        }

    }
}
