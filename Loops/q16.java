package Loops;
import java.util.*;
public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Base : ");
        int base = sc.nextInt();

        System.out.print("Enter a Power : ");
        int power = sc.nextInt();

        int result=1;

        for(int i=1; i<=power; i++)
        {
            result=result*base;
        }
        System.out.print(""+result);
    }
}
