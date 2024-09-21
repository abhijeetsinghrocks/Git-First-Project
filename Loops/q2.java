package Loops;
import java.util.*;
public class q2 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Ending Point : ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++)
        {
            System.out.println("i = "+i);
        }
    }
}
