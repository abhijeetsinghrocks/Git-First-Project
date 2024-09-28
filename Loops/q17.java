package Loops;
import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The no of table You Want : ");
        int a = sc.nextInt();

        for(int i=1; i<=10;i++)
        {
            int res = 0;
            res = a*i;
            System.out.println(a+" x "+i+" = "+res);
        }
    }
}
