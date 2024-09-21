package Loops;
import java.util.*;
public class q20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The noto check Prime or not : ");
        int a = sc.nextInt();

        int notprime =0;

        for(int i =2; i<a; i++)
        {
            if(a%i==0)
            {
                notprime=1;
                break;
            }
        }
        if(notprime==0)
        {
            System.out.println(a+" : Prime no.");
        }
        else
        {
            System.out.println(a+" : Not Prime no.");
        }
    }
}
