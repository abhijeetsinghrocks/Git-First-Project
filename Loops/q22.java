package Loops;
import java.util.*;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Finding Given No is Palindrome or not : ");
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        int palindrome = a;
        int rev = 0;
        for(;a!=0;)
        {

            int rem = 0;
            rem = a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==palindrome)
        {
            System.out.println(rev+" : is Palindrome");
        }
        else
        {
            System.out.println(palindrome+" : is Not Palindrome");
        }
    }
}
