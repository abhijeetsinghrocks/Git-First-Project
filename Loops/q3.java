package Loops;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Starting Point : ");
        int a = sc.nextInt();

        for(int i=1; a>=i; a--)
        {
            System.out.println("i = "+a);
        }
    }
}
