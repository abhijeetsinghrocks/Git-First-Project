package Loops;
import java.util.*;
public class q26Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This Program is for Find Armstrong no");
        System.out.print("Enter a No : ");
        int n = sc.nextInt();

        int temp = n;
        int comp=n;
        int result = 0;

        int count=0;
        for(;n!=0;)
        {
           int rem = n%10;
            n=n/10;
            count++;
        }

        for(;temp!=0;)
        {
            int base=1;
            int rem = temp % 10;
            temp = temp / 10;
            for (int i = 1; i <= count; i++)
            {
                base = base * rem;
            }
            result=result+base;
        }
        if(result==comp)
        {
            System.out.println(result+" : is an Armstrong no");
        }
        else
        {
            System.out.println(comp+" : is not an armstrong no");
        }
    }
}
